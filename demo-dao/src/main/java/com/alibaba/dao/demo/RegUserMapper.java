package com.alibaba.dao.demo;

import com.alibaba.entity.demo.RegUser;

import java.util.List;

public interface RegUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RegUser record);

    int insertSelective(RegUser record);

    RegUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RegUser record);

    int updateByPrimaryKey(RegUser record);

    List<RegUser> selectList();
}