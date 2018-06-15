package com.web;

public class day07 {

	/*
	 * java Bean 클래스
	 * setter 메서드
	 * getter 메서드
	 * 
	 * package com.day06.bean;
		
		import java.sql.Date;
		
		public class GuestBean {
		
			private int rn;
			private int sabun;
			private String name;
			private Date nalja;
			private int pay;
			
		//////////getter 메서드/////////////////	
			
			public int getRn(){
				return this.rn;
			}
			public int getSabun(){
				return this.sabun;
			}
			public String getName(){
				return this.name;
			}
			public Date getNalja(){
				return this.nalja;
			}
			public int getPay(){
				return this.pay;
			}
			
		//////////setter 메서드/////////////////	
			
			public void setRn(int rn){
				this.rn=rn;
			}
			public void setSabun(int sabun){
				this.sabun=sabun;
			}	
			public void setName(String name){
				this.name=name;
			}	
			public void setNalja(Date nalja){
				this.nalja=nalja;
			}
			public void setPay(int pay){
				this.pay=pay;
			}
			
		}

	 * 
	 * String sql="SELECT ROWNUM AS RN,SABUN,NAME,NALJA,PAY FROM (SELECT * FROM GUEST ORDER BY SABUN)";
		if(keyword!=null) sql="select * from ("+sql+") where name like '%"+keyword+"%'";
	 * 검색 쿼리문 글번호를 유지한채 검색되는 법
	 * 
	 * 
	 * <%@ page language="java" contentType="text/html; charset=EUC-KR"
		    pageEncoding="EUC-KR" import="java.sql.*, com.day06.bean.GuestBean , com.day06.util.MyOracle"%>
		<table width="1024" align="center">
				<tr>
					<td align="center">
					<img alt="logo" src="../imgs/logo.png" >
					</td>
				</tr>
	 * 템플릿을 만들어서 상단,메뉴,하단 나눠서 정의해놓고 가져다 씀
	 * <%@ include file="../template/header.jspf" %>
		<%@ include file="../template/menu.jspf" %>
	 * 선언할 객체들도 필드에 정의가능
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
