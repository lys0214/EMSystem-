package com.lys.emsystem.mapper;

import com.lys.emsystem.pojo.School;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class SchoolMapperTest {
    @Autowired
    private SchoolMapper schoolMapper;

    @Test
    void demo1(){
        System.out.println("测试查询所有的学校信息");
        List<School> schoolList = schoolMapper.selectList(null);
        schoolList.forEach(System.out ::println);
    }
}