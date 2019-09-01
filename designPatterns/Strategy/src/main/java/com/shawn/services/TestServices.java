package com.shawn.services;

import com.shawn.domain.Test;
import com.shawn.mapper.TestMapper;
import com.shawn.repository.TestJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TestServices {
    @Autowired
    private TestJpaRepository testJpaRepository;
    @Autowired
    private TestMapper testMapper;
    public Test findTest(Integer id){
        return testJpaRepository.findById(id).get();
    }

    public Test findTestMybatis(Integer id){
        return testMapper.SelectById(id);
    }

    public void updateTest(String username){
        testJpaRepository.updateUserByGuid(username);
    }
}
