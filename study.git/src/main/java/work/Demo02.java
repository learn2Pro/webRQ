package work;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: tang
 * Date: 16-8-3
 * Time: 下午6:07
 * To change this template use File | Settings | File Templates.
 */
public class Demo02 {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("getRequestURL: " + request.getRequestURL());
        System.out.println("getRequestURI: " + request.getRequestURI());
        System.out.println("getQueryString: " + request.getQueryString());
        System.out.println("getRemoteAddr: " + request.getRemoteAddr());
        System.out.println("getRemoteHost: " + request.getRemoteHost());
        System.out.println("getRemotePort: " + request.getRemotePort());
        System.out.println("getRemoteUser: " + request.getRemoteUser());
        System.out.println("getLocalAddr: " + request.getLocalAddr());
        System.out.println("getLocalName: " + request.getLocalName());
        System.out.println("getLocalPort: " + request.getLocalPort());
        System.out.println("getMethod: " + request.getMethod());
        System.out.println("-------request.getParamterMap()-------");
        //得到请求的参数Map，注意map的value是String数组类型
        Map map = request.getParameterMap();
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String[] values = (String[]) map.get(key);
            for (String value : values) {
                System.out.println(key + "=" + value);
            }
        }
        System.out.println("--------request.getHeader()--------");
        //得到请求头的name集合
        Enumeration<String> em = request.getHeaderNames();
        while (em.hasMoreElements()) {
            String name = (String) em.nextElement();
            String value = request.getHeader(name);
            System.out.println(name + "=" + value);
        }
    }
}
