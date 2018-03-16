package utils;

/**
 * Created with IDEA
 * author:Mind
 * <p>
 * Date:2018/3/16
 * Time:13:10
 */
public class Md5Exception extends Throwable {
    public Md5Exception(String s, Exception e) {

        e.printStackTrace();
        System.out.println(s);

    }
}
