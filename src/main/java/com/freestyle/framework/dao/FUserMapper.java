package com.freestyle.framework.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.freestyle.framework.entity.FUser;

public interface FUserMapper {

    String BASE_COLUMN = "id, username, username_cn, password, remark, create_time, update_time";
    String BASE_AUTHORITY_COLUMN = "auth.id, auth.biz_id, auth.auth_name, auth.auth_value, auth.auth_type, auth.remark, auth.create_time, auth.update_time";


    @Insert({
            "insert into f_user(id, username, username_cn, password, remark, create_time, update_time)",
            "values(#{id}, #{username}, #{usernameCn}, #{password}, #{remark}, now(), now())"
    })
    @Options(useGeneratedKeys=true, keyProperty="id")
    void insert(FUser user);

    @Select({
        "select",
        BASE_COLUMN,
        "from f_user",
        "where is_del=0 and username=#{username}"
    })
    FUser getByUsername(@Param("username") String username);
}
