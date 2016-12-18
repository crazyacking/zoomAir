package com.hut.crazyacking.service.impl;

import com.hut.crazyacking.mapper.SignUpTypeMapper;
import com.hut.crazyacking.service.SignUpTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author : crazyacking
 * @date : 2016/12/17
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
