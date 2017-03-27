package guda.mvcx.webdemoaz.dal;


import java.util.List;

import guda.mvcx.core.helper.PageQuery;
import guda.mvcx.webdemoaz.dal.model.BlogDO;

public interface BlogDAO {

        Long insert(BlogDO blogDO);

        BlogDO selectById(Long blogId);

        boolean delById(Long blogId);

        List<BlogDO> selectByIds(List idsList);

        List<BlogDO> selectForPage(PageQuery pageQuery);

        int countForPage(PageQuery pageQuery);

        void updateByIdSelective(BlogDO  blogDO);
}


