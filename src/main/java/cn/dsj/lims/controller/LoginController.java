package cn.dsj.lims.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.util.SavedRequest;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Description：
 * 登录控制器
 *
 * @author Administrator
 * @create 2019/1/8
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @ResponseBody
    @RequestMapping("/dologin")
    public Map dologin(String username,String password){
        Map msg=new HashMap();
        SavedRequest savedRequest=null;
        Subject subject=SecurityUtils.getSubject();
        UsernamePasswordToken token= new UsernamePasswordToken(username,password);
        try {
            subject.login(token);
            Session session= subject.getSession();
            if(session!=null){
                savedRequest=(SavedRequest) session.getAttribute(WebUtils.SAVED_REQUEST_KEY);
            }
            msg.put("success",true);
            msg.put("message",savedRequest.getRequestUrl());
        } catch (IncorrectCredentialsException e){
            msg.put("success",false);
            msg.put("message","密码错误"+token.getPrincipal()+" was incorrect");
            System.out.println(msg.get("message"));
        } catch (ExcessiveAttemptsException e){
            msg.put("success",false);
            msg.put("message","登录失败次数过多");
            System.out.println(msg.get("message"));
        } catch (UnknownAccountException e){
            msg.put("success",false);
            msg.put("message","用户不存在！There is no user with username of "+token.getPrincipal());
            System.out.println(msg.get("message"));
        } catch (UnauthorizedException e){
            msg.put("success",false);
            msg.put("message","???"+e.getMessage());
            System.out.println(msg.get("message"));
        }
        return msg;
    }

    @RequestMapping("/logout")
    public String logout(){
        Subject currentUser=SecurityUtils.getSubject();
        try {
            currentUser.logout();
        } catch (AuthenticationException e){
            e.printStackTrace();
        }
        return"login";
    }
}