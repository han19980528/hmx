package org.lanqiao.yk.controller;

import org.lanqiao.yk.entity.VideoInfo;
import org.lanqiao.yk.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchController {
    @Autowired
    SearchService searchService;

    @RequestMapping("/searcher")
    public List<VideoInfo> search(String keyword){
        return  searchService.searchVideoInfo(keyword);
    }

    @RequestMapping("/searchDESC")
    public List<VideoInfo> searchDESC(String keyword){
        return  searchService.searchVideo(keyword);
    }
    @RequestMapping("/searchCategory")
    public List<VideoInfo> searchCategory(String keyword){
        return  searchService.searchCategory(keyword);
    }
}
