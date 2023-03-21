package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.EmpExample;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MBGTest {

    @Test
    public void testMBG(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        1.根据id查询数据
//        Emp emp = mapper.selectByPrimaryKey(1);
//        System.out.println(emp);

//        2.查询所有数据
//        List<Emp> list = mapper.selectByExample(null);
//        list.forEach(System.out::println);

//        3.根据条件查询数据
//        EmpExample empExample = new EmpExample();
//        empExample.createCriteria().andEmpNameEqualTo("张三").andAgeEqualTo(20);
//        empExample.or().andGenderEqualTo("男");
//        List<Emp> list = mapper.selectByExample(empExample);
//        list.forEach(System.out::println);

        //测试普通修改方法
        Emp emp = new Emp(14,"Anze",20,"男",1);
        int i = mapper.updateByPrimaryKey(emp);
        System.out.println(i);
    }
}
