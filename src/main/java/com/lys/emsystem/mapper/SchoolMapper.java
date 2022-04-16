package com.lys.emsystem.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lys.emsystem.pojo.School;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface SchoolMapper extends BaseMapper<School> {
//    所有的CRUD
}
