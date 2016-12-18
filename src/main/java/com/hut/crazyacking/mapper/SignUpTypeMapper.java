package com.hut.crazyacking.mapper;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @author : crazyacking
 * @date : 2016/12/18
 */
public interface SignUpTypeMapper {
    List<HashMap> getAllSignUpType();
}
