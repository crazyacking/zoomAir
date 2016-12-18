package com.hello.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hello.mapper.SignUpMapper;
import com.hello.mapper.SignUpTypeMapper;
import com.hello.service.SignUpTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author : zhuzi
 * @date : 2016/12/18
 */
@Service
public class SignUpTypeServiceImpl implements SignUpTypeService {

    @Autowired
    private SignUpTypeMapper signUpTypeMapper;

    @Override
    public List<HashMap> getAllSignUpType() {
        return signUpTypeMapper.getAllSignUpType();
    }
}
