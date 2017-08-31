/*package com.alibaba.controller.shiro;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

*//**
 * Created by Administrator on 2017/8/28.
 *//*
public class shiroTest {

    private static  final transient Logger log = LoggerFactory.getLogger(shiroTest.class);

    public static void main(String[] args) {
        //officialDemo();
        myDemo();
    }

    private static void myDemo(){
        log.info("My Second Apache Shiro Application");

        // 1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
        IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        //2、得到SecurityManager实例 并绑定给SecurityUtils
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        // 得到当前用户 get the currently executing user:
        Subject currentUser = SecurityUtils.getSubject();
        if (!currentUser.isAuthenticated()) {
            UsernamePasswordToken token = new UsernamePasswordToken("yanlinwang", "qwe123");
            try {
                // 登录
                currentUser.login(token);
            } catch (UnknownAccountException unknownAccountException) {
                log.info("账号 " + token.getPrincipal() + "不存在");
            } catch (IncorrectCredentialsException incorrectCredentialsException) {
                log.info(" 账号 " + token.getPrincipal() + " 密码错误");
            } catch (LockedAccountException lockedAccountException) {
                log.info("账号" + token.getPrincipal() + " 已被锁定  " +
                        "请联系管理员");
            }
            // ... catch more exceptions here (maybe custom ones specific to your application?
            catch (AuthenticationException ae) {
                // unexpected condition?  error?
            }
            //test a role:
            if (currentUser.hasRole("schwartz")) {
                log.info("账号" + token.getUsername() + "有schwartz的角色");
            } else {
                log.info("账号" + token.getUsername() + "无schwartz的角色");
            }
            if (currentUser.hasRole("boss")) {
                log.info("账号" + token.getUsername() + "有boss的角色");
            } else {
                log.info("账号" + token.getUsername() + "无boss的角色");
            }

            //test a role:
            if (currentUser.isPermitted("eat:drink:shit:pee")) {
                log.info("账号" + token.getUsername() + "有eat:drink:shit:pee的权限");
            } else {
                log.info("账号" + token.getUsername() + "无eat:drink:shit:pee的权限");
            }


            //test a role:
            if (currentUser.isPermitted("pee")) {
                log.info("账号" + token.getUsername() + "有pee的权限");
            } else {
                log.info("账号" + token.getUsername() + "无pee的权限");
            }
        }
    }

    private static void officialDemo(){
        log.info("My First Apache Shiro Application");

        // 1、获取SecurityManager工厂，此处使用Ini配置文件初始化SecurityManager
        IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro.ini");

        //2、得到SecurityManager实例 并绑定给SecurityUtils
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);

        // 得到当前用户 get the currently executing user:
        Subject currentUser = SecurityUtils.getSubject();

        // 不需要web容器，也可以Do some stuff with a Session (no need for a web or EJB container!!!)
        Session session = currentUser.getSession();
        session.setAttribute("someKey", "aValue");
        // 拿到刚才设置的session
        String value = (String) session.getAttribute("someKey");
        if (value.equals("aValue")) {
            log.info("Retrieved the correct value! [" + value + "]");
        }

        // 让我们登录当前用户，来看看用户的角色和权限
        // let's login the current user so we can check against roles and permissions:
        if (!currentUser.isAuthenticated()) {
            // lonestarr是 shior.ini中的用户，vespa是lonestarr的密码
            UsernamePasswordToken token = new UsernamePasswordToken("lonestarr", "vespa");
            // 记住我功能
            token.setRememberMe(true);
            try {
                // 登录
                currentUser.login(token);
            } catch (UnknownAccountException uae) {
                log.info("There is no user with username of " + token.getPrincipal());
            } catch (IncorrectCredentialsException ice) {
                log.info("Password for account " + token.getPrincipal() + " was incorrect!");
            } catch (LockedAccountException lae) {
                log.info("The account for username " + token.getPrincipal() + " is locked.  " +
                        "Please contact your administrator to unlock it.");
            }
            // ... catch more exceptions here (maybe custom ones specific to your application?
            catch (AuthenticationException ae) {
                // unexpected condition?  error?
            }
        }

        // say who they are:
        // print their identifying principal (in this case, a username):
        log.info("User [" + currentUser.getPrincipal() + "] logged in successfully.");

        //test a role:
        if (currentUser.hasRole("schwartz")) {
            log.info("May the Schwartz be with you!");
        } else {
            log.info("Hello, mere mortal.");
        }

        // test a typed permission (not instance-level)
        // 测试用户的权限，因为lonestarr在schwartz组中
        // schwartz = lightsaber:*  schwartz组有权限
        if (currentUser.isPermitted("lightsaber:weild")) {
            log.info("You may use a lightsaber ring.  Use it wisely.");
        } else {
            log.info("Sorry, lightsaber rings are for schwartz masters only.");
        }

        // a (very powerful) Instance Level permission:
        if (currentUser.isPermitted("winnebago:drive:eagle5")) {
            log.info("You are permitted to 'drive' the winnebago with license plate (id) 'eagle5'.  " +
                    "Here are the keys - have fun!");
        } else {
            log.info("Sorry, you aren't allowed to drive the 'eagle5' winnebago!");
        }

        // all done - log out!
        // 退出
        currentUser.logout();

        System.exit(0);
    }

}*/

        /*shiro测试配置文件 如有需要 则在resource下新建shiro.ini并将下面的内容copy进去*/
        /*# =============================================================================
        # Tutorial INI configuration
        #
        # Usernames/passwords are based on the classic Mel Brooks' film "Spaceballs" :)
        # =============================================================================

        # -----------------------------------------------------------------------------
        # Users and their (optional) assigned roles
        # username = password, role1, role2, ..., roleN
        # -----------------------------------------------------------------------------
        [users]
        root = secret, admin
        guest = guest, guest
        presidentskroob = 12345, president
        darkhelmet = ludicrousspeed, darklord, schwartz
        lonestarr = vespa, goodguy, schwartz
        yanlinwang = qwe123 , boss
        chongmianhe = a123 , staff
        jiwuchen = tes1234 , headman
        #[users] 规则：{账号} = {密码} , {角色1} , {角色2} ,{And So On ....}
        # -----------------------------------------------------------------------------
        # Roles with assigned permissions
        # roleName = perm1, perm2, ..., permN
        # -----------------------------------------------------------------------------
        [roles]
        admin = *
        schwartz = lightsaber:*
        goodguy = winnebago:drive:eagle5
        boss = eat:drink:shit:pee
        manager = drink:shit:pee
        headman = shit:pee
        staff = pee
        #[roles] 规则: {角色} = {权限1}:{权限2}:{权限3}*/