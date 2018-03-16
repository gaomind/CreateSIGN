import utils.MD5Util;
import utils.Md5Exception;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/**
 * Created with IDEA
 * author:Mind
 * <p>
 * Date:2018/3/16
 * Time:12:55
 */
public class CreateSIGN {



    public static String createSign(Map<String, String> params, boolean encode) throws UnsupportedEncodingException, Md5Exception {


        Set<String> keysSet = params.keySet();
        Object[] keys = keysSet.toArray();
        Arrays.sort(keys);
        StringBuffer temp = new StringBuffer();
        boolean first = true;
        for (Object key : keys) {
            if (first) {
                first = false;
            } else {
                temp.append("&");
            }
            temp.append(key).append("=");
            Object value = params.get(key);
            String valueString = "";
            if (null != value) {
                valueString = String.valueOf(value);
            }
            if (encode) {
                temp.append(URLEncoder.encode(valueString, "UTF-8"));
            } else {
                temp.append(valueString);
            }
        }
        return MD5Util.md5(temp.toString()).toUpperCase();
    }


}
