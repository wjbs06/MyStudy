package com.bit.model;

import com.bit.model.entity.GuestVo;

public class GuestDao {

	public GuestVo selectOne(int sabun) {
		
		GuestVo bean = new GuestVo(sabun,"test", null, 1000);
		
		
		
		return bean;

	}
	
}
