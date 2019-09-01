package com.shawn.mapper;

import com.shawn.domain.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    Test SelectById(int id);
}
