package org.lanqiao.yk.service;

import org.lanqiao.yk.entity.Articles;

import java.util.List;

public interface ArticlesService {
    public int addArticles(Articles articles);
    public List<Articles> searchArticles(String keyword);
    public Articles getArticlesById(int id);
}
