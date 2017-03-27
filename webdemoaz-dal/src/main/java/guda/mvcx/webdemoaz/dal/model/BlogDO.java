package guda.mvcx.webdemoaz.dal.model;

import guda.mvcx.gen.annotation.GenField;

import java.util.Date;

public class BlogDO {


    private Long blogId;
    @GenField(cn="标题")
    private String blogTitle;
    @GenField(cn="内容")
    private String blogContent;
    private Integer blogStatus;
    private Date gmtCreate;
    private Date gmtUpdate;


    public Long getBlogId() {
      return blogId;
    }

    public void setBlogId(Long blogId) {
      this.blogId = blogId;
    }

    public String getBlogTitle() {
      return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
      this.blogTitle = blogTitle;
    }

    public String getBlogContent() {
      return blogContent;
    }

    public void setBlogContent(String blogContent) {
      this.blogContent = blogContent;
    }

    public Integer getBlogStatus() {
      return blogStatus;
    }

    public void setBlogStatus(Integer blogStatus) {
      this.blogStatus = blogStatus;
    }

    public Date getGmtCreate() {
      return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
      this.gmtCreate = gmtCreate;
    }

    public Date getGmtUpdate() {
      return gmtUpdate;
    }

    public void setGmtUpdate(Date gmtUpdate) {
      this.gmtUpdate = gmtUpdate;
    }


}

