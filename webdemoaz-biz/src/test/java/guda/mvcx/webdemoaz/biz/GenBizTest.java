package guda.mvcx.webdemoaz.biz;

import guda.mvcx.gen.GenBiz;
import guda.mvcx.gen.GenContext;

import java.io.File;

/**
 * Created by well on 2017/3/27.
 */
public class GenBizTest {

    public static void main(String[] args) throws Exception {
        String baseDir = System.getProperties().get("user.dir") + File.separator + "webdemoaz-biz";

        GenContext genContext = new GenContext(baseDir, "guda.mvcx.webdemoaz.dal.model.BlogDO", "guda.mvcx.webdemoaz.biz");

        System.out.println(baseDir);
        GenBiz genBiz = new GenBiz(genContext);

        genBiz.gen();
    }
}
