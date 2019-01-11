package cn.dsj.lims.filter;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Description：
 * 自定义FormAuthenticationFilter
 *
 * @author Administrator
 * @create 2019/1/11
 */
public class MyFormAuthenticationFilter extends FormAuthenticationFilter {
    /**
     * 重写原认证成功后链接跳转方法
     * @param request
     * @param response
     * @throws Exception
     */
    @Override
    protected void issueSuccessRedirect(ServletRequest request, ServletResponse response) throws Exception {
        System.out.println("MyFormAuthenticationFilter");
        WebUtils.issueRedirect(request,response,getSuccessUrl(),null,true);
    }
}