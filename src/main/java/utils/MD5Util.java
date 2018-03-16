package utils;

import org.apache.commons.net.util.Base64;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 * Created with IDEA
 * author:Mind
 * <p>
 * Date:2018/3/16
 * Time:13:00
 */
public class MD5Util {
    public static String md5(String src) throws Md5Exception {

        try {

            MessageDigest md = MessageDigest.getInstance("MD5");

            byte[] output = md.digest(src.getBytes());

            String ret = Base64.encodeBase64String(output);

            return ret;

        } catch (Exception e) {
            throw new Md5Exception("加密失败!",e);

        }

    }
}