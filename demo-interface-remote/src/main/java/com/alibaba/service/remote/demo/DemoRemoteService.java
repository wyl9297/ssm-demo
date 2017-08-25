package com.alibaba.service.remote.demo;

import com.alibaba.entity.demo.Student;

/**
 * Created by Administrator on 2017/8/25.
 */
public interface DemoRemoteService {

    void printInteger(Integer content);

    void printStudent(Student student);
}
