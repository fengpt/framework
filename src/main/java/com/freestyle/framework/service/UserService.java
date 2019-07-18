package com.freestyle.framework.service;

import com.freestyle.framework.entity.FUser;

/**
 * 用户相关的操作
 * @author huangxiaohui
 *
 */
public interface UserService {
    /**
     * 添加用户
     * @param user
     * @return
     */
    public FUser addUser(FUser user);

}
