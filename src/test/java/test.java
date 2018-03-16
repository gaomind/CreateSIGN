

import utils.Md5Exception;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;


/**
 * Created with IDEA
 * author:Mind
 * <p>
 * Date:2018/3/16
 * Time:13:13
 */
public class test {






    public static void main(String[] args) throws UnsupportedEncodingException, Md5Exception {

        Map<String ,String> params = new HashMap<String, String>();


       // 根据用户请求的url参数，服务器端按照同样的规则生成sign签名，假数据测试


        //String name=request.getParameterNames();
        String name="mindkey";

        //String name=request.getParameter(name);
        String value="mindvalue";

        params.put(name,value);

        String encryptionURL = CreateSIGN.createSign(params, true);

        System.out.println("加密后的URL:"+encryptionURL);

    }


}
