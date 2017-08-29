package com.alibaba.controller.demo;

import com.alibaba.entity.demo.RegUser;
import com.alibaba.service.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2017/8/25.
 */
@Controller
@RequestMapping ( value = "/admin")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/demo1")
    public ModelAndView demo1(HttpServletRequest request , HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView("demo/userList");
        List<RegUser> regUsers = demoService.selectList();
        modelAndView.addObject("regUsers",regUsers);
        return modelAndView;
    }

}
