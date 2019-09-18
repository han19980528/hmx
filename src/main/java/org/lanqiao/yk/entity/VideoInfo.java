package org.lanqiao.yk.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.Date;
@SolrDocument(solrCoreName = "articles")
public class VideoInfo {
    @Id
    @Indexed
    private Integer id;
    @Indexed
    private String videoName;
    @Indexed
    private String videoDescript;
    @Indexed
    private Date videoCreateTime;
    @Indexed
    private String videoDirector;
    @Indexed
    private String videoActor;
    @Indexed
    private String videoPic;
    @Indexed
    private String category;

    public Integer id() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getVideoDescript() {
        return videoDescript;
    }

    public void setVideoDescript(String videoDescript) {
        this.videoDescript = videoDescript == null ? null : videoDescript.trim();
    }

    public Date getVideoCreateTime() {
        return videoCreateTime;
    }

    public void setVideoCreateTime(Date videoCreateTime) {
        this.videoCreateTime = videoCreateTime;
    }

    public String getVideoDirector() {
        return videoDirector;
    }

    public void setVideoDirector(String videoDirector) {
        this.videoDirector = videoDirector == null ? null : videoDirector.trim();
    }

    public String getVideoActor() {
        return videoActor;
    }

    public void setVideoActor(String videoActor) {
        this.videoActor = videoActor == null ? null : videoActor.trim();
    }

    public String getVideoPic() {
        return videoPic;
    }

    public void setVideoPic(String videoPic) {
        this.videoPic = videoPic == null ? null : videoPic.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }
}