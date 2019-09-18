package org.lanqiao.yk.service;

import org.apache.solr.client.solrj.response.UpdateResponse;
import org.lanqiao.yk.entity.Articles;
import org.lanqiao.yk.mapper.ArticlesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.core.query.result.ScoredPage;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ArticlesServiceImpl implements ArticlesService{
    @Autowired
    private SolrTemplate solrTemplate;

    @Autowired
    private ArticlesMapper articlesMapper;

    @Override
    public int addArticles(Articles articles){
        //向数据库插入数据
        articlesMapper.insertSelective(articles);

        //维护solr
        UpdateResponse updateResponse = solrTemplate.saveBean("articles",articles);
        solrTemplate.commit("articles");
        return updateResponse.getStatus();
    }

    @Override
    public List<Articles> searchArticles(String keyword) {
        //查询所有
        Query query = new SimpleQuery();

        //设置条件
        Criteria criteria = new Criteria("title").is(keyword);
        query.addCriteria(criteria);

        //设置分页
        query.setOffset(0l);//开始索引，默认0
        query.setRows(10);//每页记录数

        //设置排序规则
        Sort sort = new Sort(Sort.Direction.ASC,"createDate");
        query.addSort(sort);

        //查询
        ScoredPage<Articles> pages = solrTemplate.queryForPage("articles",query,Articles.class);
        System.out.println("pages.getTotalElements() = "+ pages.getTotalElements());
        List<Articles> content = pages.getContent();
        return content;
    }

    @Override
    public Articles getArticlesById(int id){
        return  articlesMapper.selectByPrimaryKey(id);
    }
}
