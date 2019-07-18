package com.freestyle.framework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.freestyle.framework.common.ResponseData;
import com.freestyle.framework.entity.FUser;
import com.freestyle.framework.service.UserService;

/**
 * 用户相关的接口
 * @author huangxiaohui
 *
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    /**
     * 添加用户
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseData<?> add(@RequestBody FUser user) {
        userService.addUser(user);
        return new ResponseData<>(user);
    }
    
    /**
     * 修改用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ResponseData<?> update(@RequestBody FUser user) {
        
        return null;
    }
    
    /**
     * 删除用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ResponseData<?> delete(@RequestParam("id") Long id) {
        
        return null;
    }
    
    
    /**
     * 查询单个用户
     * @param user
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseData<?> get(@PathVariable("id") Long id) {
        
        return null;
    }
    
    /**
     * 查询用户列表
     * @param user
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseData<?> list(@RequestParam("user") FUser user) {
        
        return null;
    }
    
}
