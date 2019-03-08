package com.alibaba.controller.shiro;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/8/29.
 */
@Controller
@RequestMapping( value = "/admin")
public class AdminController {
    // 登录成功的页面
    @RequestMapping(value = "/home")
    public String adminHomePage(){
        return "admin/home";
    }

    // 只有角色为admin的才能访问
    @RequiresRoles("admin")
    @RequestMapping(value = "/role")
    public String adminWithRole(){
        return "admin/withrole";
    }

    // 具有user:view或(和)user:create权限才能访问
    @RequiresPermissions(value={"user:view","user:create"}, logical= Logical.OR)
    @RequestMapping(value = "/auth")
    public String adminWithAuth(){
        return "admin/withauth";
    }

    @RequiresRoles("admin")
    @RequestMapping( value = "ajaxUpload")
    public ModelAndView ajaxUpload(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/ajaxUpload");
        return modelAndView;
    }

    @RequestMapping( value = "importExcel")
    @ResponseBody
    public void importExcel(HttpServletRequest request , HttpServletResponse response, @RequestParam(value = "excelFile", required = false) MultipartFile file) throws IOException {
        Map<String, Object> hashMap = new HashMap<String, Object>();
        if(file == null){
            hashMap.put("result" , "fail");
        } else {
            hashMap.put("result" , "success");
        }
    }

    @RequestMapping( value = "lottery")
    public ModelAndView lottery(HttpServletRequest request , HttpServletResponse response) throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/lottery");
        return modelAndView;
    }
}
