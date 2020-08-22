package com.qf.config;

import com.qf.realm.ShiroRealm;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShiroConfig {
      //配置shiro过滤器
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager){
          //创建shiro工厂对象
          ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
          //设置安全管理器
          factoryBean.setSecurityManager(securityManager);
        //如果没有认证将会请求此地址进行认证，请求此地址将由formAuthenticationFilter进行表单认证，跳转到指定资源（比如登陆页面）
          factoryBean.setLoginUrl("/login");
          factoryBean.setUnauthorizedUrl("/refuse");
          return factoryBean;
    }
    @Bean
    public SecurityManager createSecurityManager(Realm createRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(createRealm);
        return securityManager;
    }
    @Bean
    public Realm createRealm(){
        ShiroRealm shiroRealm = new ShiroRealm();
        return shiroRealm;
    }


}
