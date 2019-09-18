package org.lanqiao.yk.service;

import org.lanqiao.yk.entity.VideoInfo;

import java.util.List;

public interface SearchService {
//    相关
    public List<VideoInfo> searchVideoInfo(String keyword);
//    最新
    public List<VideoInfo> searchVideo(String keyword);
//    查询分类
public List<VideoInfo> searchCategory(String keyword);
}
