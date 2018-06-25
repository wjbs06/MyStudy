package com.bit.myapp03.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

import com.bit.myapp03.model.entity.GuestVo;

public class GuestDaoImf03 extends SimpleJdbcDaoSupport implements GuestDao {
	
	
	@Override
	public List<GuestVo> selectAll() throws SQLException {
		String sql="SELECT * FROM GUEST ORDER BY SABUN";
		return getSimpleJdbcTemplate().query(sql,new RowMapper<GuestVo>() {

			@Override
			public GuestVo mapRow(ResultSet rs, int rowNum) throws SQLException {
				GuestVo bean=new GuestVo();
				bean.setSabun(rs.getInt("sabun"));
				bean.setName(rs.getString("name"));
				bean.setNalja(rs.getDate("nalja"));
				bean.setPay(rs.getInt("pay"));
				return bean;
			}
		});
	}

	@Override
	public GuestVo selectOne(int sabun) throws SQLException {
		return null;
		
	}

	@Override
	public int insertOne(GuestVo bean) throws SQLException {
//		DataSourceTransactionManager tm=new DataSourceTransactionManager();
//		TransactionTemplate template=new TransactionTemplate(tm);
//		template.getTransactionManager();
//		try(Connection conn=dataSource.getConnection()){
//		}
		return 0;
	}

	@Override
	public int updateOne(GuestVo bean) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOne(int sabun) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public DataSource dataSoucre() {
		// TODO Auto-generated method stub
		return null;
	}

}
