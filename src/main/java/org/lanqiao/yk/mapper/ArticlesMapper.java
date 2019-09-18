package org.lanqiao.yk.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lanqiao.yk.entity.Articles;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ArticlesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Articles record);

    int insertSelective(Articles record);

    Articles selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Articles record);

    int updateByPrimaryKey(Articles record);
}