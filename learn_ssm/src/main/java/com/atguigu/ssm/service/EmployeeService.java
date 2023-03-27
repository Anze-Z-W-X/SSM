package com.atguigu.ssm.service;

import com.atguigu.ssm.pojo.Employee;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Date:2022/7/11
 * Author:ybc
 * Description:
 */
public interface EmployeeService {


    List<Employee> getAllEmployee();


    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
