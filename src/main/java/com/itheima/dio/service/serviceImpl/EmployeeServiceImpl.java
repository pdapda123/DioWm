package com.itheima.dio.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.dio.dao.EmployeeDao;
import com.itheima.dio.pojo.Employee;
import com.itheima.dio.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeDao,Employee> implements EmployeeService {
}