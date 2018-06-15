package com.web;

public class day08 {

	/*
	 * 	<jsp:include page="template/header.jsp">
			<jsp:param value="." name="path"/>
		</jsp:include>
		<jsp:include page="template/menu.jsp">
			<jsp:param value="." name="path"/>
		</jsp:include>
					<img alt="main" src="imgs/main.jpg">
		<jsp:include page="template/footer.jsp"></jsp:include>	
	 * 액션태그를 사용하여 index에서 사용
	 * 
	 * 
	 * <jsp:useBean id="bean" class="com.day07.bean.GuestBean"></jsp:useBean>
		<jsp:setProperty property="sabun" name="bean"/>
		
		<%
			//String param=request.getParameter("sabun");
			//int sabun=Integer.parseInt(param.trim());
			
			//GuestBean bean=new GuestBean();
			//String sql="select * from guest where sabun="+sabun;
	 * 
	 * 기존에 선언하여 사용하던것을 usebean과 setproperty로 대체가능
	 * 
	 * <jsp:getProperty property="sabun" name="bean"/>
	 * 위의 usebean을 써야 사용가능
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
