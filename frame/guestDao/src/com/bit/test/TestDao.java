package com.bit.test;

import org.apache.log4j.Logger;

import com.bit.model.GuestDao;
import com.bit.model.entity.GuestVo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestDao {
	static Logger logger=Logger.getLogger(TestDao.class);
	GuestDao dao;
	
//	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
//		GuestDao dao=new GuestDao();
//		GuestVo bean=dao.selectOne();
//		
//		logger.debug(bean);
//		logger.info(bean);
//		logger.warn(bean);
//		logger.error(bean);
//		logger.fatal(bean);
//		
//	}
	@BeforeClass
	public static void beforeClass(){
		System.out.println("beforeClass 角青");
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("afterClass 角青");
	}
	
	@Before
	public void before(){
		System.out.println("before 角青");
		GuestDao dao=new GuestDao();
	}
	
	@After
	public void after(){
		System.out.println("after 角青");
	}
	
	@Test
	public void selectOne() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		GuestDao dao=new GuestDao();
		GuestVo bean=dao.selectOne();
		Assert.assertNotNull(bean);
		
		String su="1";
		Assert.assertSame("1", su);
		Assert.assertEquals("1", su);
	}
	
	@Test
	public void updateOne() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
//		GuestDao dao=new GuestDao();
		GuestDao dao=null;
		
			Class<?> clzz=null;
			clzz=Class.forName("com.bit.model.GuestDao");
			dao=(GuestDao) clzz.newInstance();
	
		
		
		int su=dao.updateOne();
		Assert.assertTrue(su>0);
		Assert.assertSame(1,su);
	}
	
	
	
	
}
