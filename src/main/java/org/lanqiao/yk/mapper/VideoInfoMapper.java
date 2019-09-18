package org.lanqiao.yk.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lanqiao.yk.entity.VideoInfo;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface VideoInfoMapper {
    int deleteByPrimaryKey(Integer videoId);

    int insert(VideoInfo record);

    int insertSelective(VideoInfo record);

    VideoInfo selectByPrimaryKey(Integer videoId);

    int updateByPrimaryKeySelective(VideoInfo record);

    int updateByPrimaryKey(VideoInfo record);
}