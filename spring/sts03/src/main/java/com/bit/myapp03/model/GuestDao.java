package com.bit.myapp03.model;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.bit.myapp03.model.entity.GuestVo;

public interface GuestDao {
	
	DataSource dataSoucre();
	
	List<GuestVo> selectAll() throws SQLException;
	GuestVo selectOne(int sabun) throws SQLException;
	int insertOne(GuestVo bean) throws SQLException;
	int updateOne(GuestVo bean) throws SQLException;
	int deleteOne(int sabun) throws SQLException;
	
}
