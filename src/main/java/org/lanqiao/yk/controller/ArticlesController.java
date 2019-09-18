package org.lanqiao.yk.controller;


import org.lanqiao.yk.entity.Articles;
import org.lanqiao.yk.service.ArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticlesController   {
    @Autowired
    ArticlesService articlesService;

    @RequestMapping("/save")
    public String save(@RequestBody Articles articles){
        int ret = articlesService.addArticles(articles);
        if(ret==0){
            return  "success save !";
        }else {
            return "error";
        }
    }


    @RequestMapping("/get")
    public Articles selectById(int id){
        return articlesService.getArticlesById(id);
    }

    @RequestMapping("/search")
    public List<Articles> search(String keyword){
        return  articlesService.searchArticles(keyword);
    }


}
