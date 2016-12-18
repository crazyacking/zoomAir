package com.hut.crazyacking.service.impl;

import com.hut.crazyacking.mapper.SignUpTypeMapper;
import com.hut.crazyacking.service.SignUpTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @author : crazyacking
 * @date : 2016/12/18
 */
@Service
public class SignUpTypeServiceImpl implements SignUpTypeService {

    @Resource(name = "signUpTypeMapper")
    private SignUpTypeMapper signUpTypeMapper;

    @Override
    public List<HashMap> getAllSignUpType() {
        return signUpTypeMapper.getAllSignUpType();
    }
}
