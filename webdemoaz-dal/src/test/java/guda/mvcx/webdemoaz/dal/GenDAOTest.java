package guda.mvcx.webdemoaz.dal;

import guda.mvcx.gen.GenContext;
import guda.mvcx.gen.GenDAO;

import java.io.File;

/**
 * Created by well on 2017/3/27.
 */
public class GenDAOTest {

    private static String jdbUrl = "jdbc:mysql://127.0.0.1:3306/webdemoaz?useUnicode=true&characterEncoding=utf8";

    public static void main(String[] args){
        String baseDir = System.getProperties().get("user.dir") + File.separator + "webdemoaz-dal";
        GenContext genContext = new GenContext("com.mysql.jdbc.Driver", jdbUrl, "webdemoaz_user", "webdemoaz_pwd", baseDir, "guda.mvcx.webdemoaz.dal");

        System.out.println(baseDir);
        GenDAO genDAO = new GenDAO(genContext);
        genDAO.genBatch("b_blog", "b_");
    }
}
