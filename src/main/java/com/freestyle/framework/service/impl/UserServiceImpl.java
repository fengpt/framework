package com.freestyle.framework.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freestyle.framework.dao.FUserMapper;
import com.freestyle.framework.entity.FUser;
import com.freestyle.framework.enums.UserErrorEnum;
import com.freestyle.framework.exception.FreestyleException;
import com.freestyle.framework.service.UserService;

/**
 * @author huangxiaohui
 *
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private FUserMapper userMapper;
    
    @Override
    public FUser addUser(FUser user) {
        if(user == null)
            throw new FreestyleException(UserErrorEnum.USER_NULL.getCode(), UserErrorEnum.USER_NULL.getMessage());
        if(StringUtils.isBlank(user.getUsername()))
            throw new FreestyleException(UserErrorEnum.USER_NAME_EMPTY.getCode(), UserErrorEnum.USER_NAME_EMPTY.getMessage());
        if(StringUtils.isBlank(user.getPassword()))
            throw new FreestyleException(UserErrorEnum.USER_PASSWORD_EMPTY.getCode(), UserErrorEnum.USER_PASSWORD_EMPTY.getMessage());

        FUser userPo = userMapper.getByUsername(user.getUsername());
        if(userPo != null)
            throw new FreestyleException(UserErrorEnum.USER_NAME_EXISTS.getCode(), UserErrorEnum.USER_NAME_EXISTS.getMessage());
        // 用户信息保存
        userMapper.insert(user);
        return user;
    }
}
