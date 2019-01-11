package cn.dsj.lims.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import cn.dsj.lims.filter.MyFormAuthenticationFilter;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Description：
 * Shiro配置类
 *
 * @author Administrator
 * @create 2019/1/7
 */
@Configuration
public class ShiroConfig {
    //用于thymeleaf模板使用shiro标签
    @Bean
    public ShiroDialect shiroDialect() {
        return new ShiroDialect();
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //拦截器
        Map<String,String> filterChainDefinitiorMap=new LinkedHashMap<>();
        //配置静态资源过滤器
        filterChainDefinitiorMap.put("/css/**","anon");
        filterChainDefinitiorMap.put("/img/**","anon");
        filterChainDefinitiorMap.put("/js/**","anon");
        filterChainDefinitiorMap.put("/jquery-easyui-1.4.2/**","anon");
        //配置登录操作过滤器
        filterChainDefinitiorMap.put("/dologin","anon");
        //配置退出过滤器
        filterChainDefinitiorMap.put("/logout","logout");
        //authc：所有url都必须认证才能通过;
        filterChainDefinitiorMap.put("/**","authc");
        //设置登录的url
        shiroFilterFactoryBean.setLoginUrl("/login");
        //未授权界面
        shiroFilterFactoryBean.setUnauthorizedUrl("/403");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitiorMap);
        return shiroFilterFactoryBean;
    }

    @Bean
    public MyShiroRealm myShiroRealm(){
        MyShiroRealm myShiroRealm=new MyShiroRealm();
        return myShiroRealm;
    }

    @Bean
    public SecurityManager securityManager(){
        DefaultWebSecurityManager defaultWebSecurityManager=new DefaultWebSecurityManager();
        defaultWebSecurityManager.setRealm(myShiroRealm());
        return defaultWebSecurityManager;
    }
}