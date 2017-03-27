package guda.mvcx.webdemoaz.biz;

import com.google.inject.ImplementedBy;
import guda.mvcx.core.annotation.biz.Biz;
import guda.mvcx.core.helper.BizResult;
import guda.mvcx.core.helper.PageQuery;
import guda.mvcx.webdemoaz.biz.impl.BlogBizImpl;
import guda.mvcx.webdemoaz.dal.model.BlogDO;

@Biz
@ImplementedBy(BlogBizImpl.class)
public interface BlogBiz {

    BizResult detail(long id);

    BizResult list(PageQuery pageQuery);

    BizResult delete(long id);

    BizResult create(BlogDO blogDO);

    BizResult update(BlogDO blogDO);

}
