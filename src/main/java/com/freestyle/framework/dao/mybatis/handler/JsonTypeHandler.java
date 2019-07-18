package com.freestyle.framework.dao.mybatis.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import com.alibaba.fastjson.JSON;

public class JsonTypeHandler extends BaseTypeHandler<Object>{

	@Override
	public Object getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return JSON.parse(rs.getString(columnName));
	}

	@Override
	public Object getNullableResult(ResultSet rs, int i) throws SQLException {
		return JSON.parse(rs.getString(i));
	}

	@Override
	public Object getNullableResult(CallableStatement cs, int i) throws SQLException {
		return JSON.parse(cs.getString(i));
	}

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Object parameter, JdbcType jdbcType) throws SQLException {
		ps.setString(i, parameter==null?"":JSON.toJSONString(parameter));
	}

}
