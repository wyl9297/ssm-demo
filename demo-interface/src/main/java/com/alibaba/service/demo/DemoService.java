package com.alibaba.service.demo;

import com.alibaba.entity.demo.RegUser;
import com.alibaba.entity.demo.Student;

import java.util.List;

/**
 * Created by Administrator on 2017/8/25.
 */
public interface DemoService {

    void printString(String content);

    void printStudent(Student student);

    List<RegUser> selectList();
}
