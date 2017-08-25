package com.alibaba.dao.demo;

import com.alibaba.entity.demo.bmpfjzProject;

public interface bmpfjzProjectMapper {
    int deleteByPrimaryKey(Long id);

    int insert(bmpfjzProject record);

    int insertSelective(bmpfjzProject record);

    bmpfjzProject selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(bmpfjzProject record);

    int updateByPrimaryKey(bmpfjzProject record);
}