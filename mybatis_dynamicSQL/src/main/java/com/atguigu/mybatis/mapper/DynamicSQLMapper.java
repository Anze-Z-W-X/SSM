package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {

    List<Emp> getEmpByCondition(Emp emp);

    List<Emp> getEmpByConditionTwo(Emp emp);

    List<Emp> getEmpByConditionThree(Emp emp);

    void insertMoreEmp(@Param("emps")List<Emp> emps);

    void deleteMoreEmp(@Param("empIds")Integer[] empIds);
}
