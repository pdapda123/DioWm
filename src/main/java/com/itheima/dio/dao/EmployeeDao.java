package com.itheima.dio.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.dio.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeDao extends BaseMapper<Employee> {
}
