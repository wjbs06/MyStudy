package com.net.am;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex04 {

	
	public static void main(String[] args) {
		try {
			URL url=new URL("http://www.naver.com");
			URLConnection uc=url.openConnection();
			uc.connect();
			Map<String, List<String>> map=uc.getHeaderFields();
//			Set<String> key=map.keySet();
//			Iterator<String> ite=key.iterator();
//			while(ite.hasNext()){
//				System.out.println(ite.next());
//			}
			//Transfer-Encoding
			//null
			//Server
			//Connection
			//Vary
			//Date
			//Location
			//Content-Type
			List<String> date=map.get("Date");
			for (int i = 0; i < date.size(); i++) {
				System.out.println(date.get(i));
			}
			int su=uc.getContentLength();
			System.out.println(su);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
