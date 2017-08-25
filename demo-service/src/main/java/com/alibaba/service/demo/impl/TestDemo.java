package com.alibaba.service.demo.impl;

import com.alibaba.dao.demo.RegUserMapper;
import com.alibaba.entity.demo.RegUser;
import com.alibaba.entity.demo.Student;
import com.alibaba.service.demo.DemoService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/25.
 */
@Service
public class TestDemo implements DemoService {

    @Autowired
    RegUserMapper regUserMapper;

    public void printString(String content) {
        System.out.println(content);
        RegUser regUser = regUserMapper.selectByPrimaryKey(1L);
        System.out.println(regUser.toString());
    }

    public void printStudent(Student student) {
    }

    public List<RegUser> selectList() {
        PageHelper.startPage(1,10,false);
        List<RegUser> regUsers = regUserMapper.selectList();
        return regUsers;
    }
}