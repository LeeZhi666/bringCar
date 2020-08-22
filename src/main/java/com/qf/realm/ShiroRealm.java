package com.qf.realm;

import com.qf.mapper.UserMapper;
import com.qf.pojo.User;
import com.qf.service.UserService;
import com.qf.service.impl.UserServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

public class ShiroRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String principal ="";
        if(Objects.nonNull(authenticationToken.getPrincipal())){
            principal=(String) authenticationToken.getPrincipal();
        }
        System.out.println(principal);
        Object credentials = authenticationToken.getCredentials();
        String password="";
        if(Objects.nonNull(password)){
            password = new String((char[]) credentials);
        }
        System.out.println(password);
        User user = new User(principal, password);
//        if (userService.login(user)!=null){
        if (userService.login(user)!=null){
            SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(principal, password, "");
//            Session session = SecurityUtils.getSubject().getSession();
//            session.getAttribute();
//            session.setAttribute();
            return authenticationInfo;
        }
        return null;
    }
}
