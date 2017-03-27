package guda.mvcx.webdemoaz.biz.form;

import guda.mvcx.webdemoaz.dal.model.BlogDO;

import javax.validation.constraints.NotNull;


public class BlogEditForm extends BlogForm{

    @NotNull(message = "不能为空")
    private Long blogId;

    public void init(BlogDO blogDO){
        if(blogDO==null){
            return;
        }
        setBlogContent(blogDO.getBlogContent());
        setBlogTitle(blogDO.getBlogTitle());
    }

    public BlogDO toDO(){
        BlogDO blogDO=super.toDO();
        setBlogId(blogId);
        return blogDO;
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }
}

