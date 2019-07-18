package com.freestyle.framework.entity;

import lombok.Data;

import java.util.Date;

/**
 * 用户信息
 * @author huangxiaohui
 *
 */
@Data
public class FUser {
    
    // 是否已删除 0-未删除；1-已删除
    public static final Integer IS_DEL_IN_USE = 0;
    public static final Integer IS_DEL_DELETED = 1;

    /**
     * 主键
     */
    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 中文用户名
     */
    private String usernameCn;
    /**
     * 密码
     */
    private String password;
    /**
     * 备注
     */
    private String remark;
    
    /**
     * 是否已删除 0-未删除；1-已删除
     */
    private int isDel;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

}
