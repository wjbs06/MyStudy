package com.bit.model;

import org.apache.log4j.Logger;

import com.bit.model.entity.GuestVo;

public class GuestDao {
	
	//Logger logger=Logger.getLogger("com.bit.mode.GuestDao");
	Logger logger=Logger.getLogger(GuestDao.class);
	
	public GuestVo selectOne() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		GuestVo bean=new GuestVo(1111,"test",null,1000);
		
		GuestDao dao=new GuestDao();
		
		Class clzz=Class.forName("com.bit.model.GuestDao");
		GuestDao dao2=(GuestDao) clzz.newInstance();
		
		System.out.println("bean"+bean);
		return bean;
	}
	
	public int updateOne(){

		
		return 1;
	}
}
