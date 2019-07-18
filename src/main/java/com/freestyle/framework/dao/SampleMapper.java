package com.freestyle.framework.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.freestyle.framework.dao.mybatis.handler.JsonTypeHandler;
import com.freestyle.framework.entity.Sample;

public interface SampleMapper {

    public static final String BASE_COLUMN_LIST = "id, s_name, s_price, s_json, create_time, update_time";
    
    @Select({
        "select",
        BASE_COLUMN_LIST,
        "from sample",
        "where s_name=#{sName}",
        "order by id"
    })
    @Results({
        @Result(property="sJson",column="s_json", typeHandler= JsonTypeHandler.class)
    })
    List<Sample> getSampleByName(@Param("sName")String sName);

}
