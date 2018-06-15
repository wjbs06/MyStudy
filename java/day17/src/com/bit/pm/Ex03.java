package com.bit.pm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Lec03{}
public class Ex03 {

	
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("¿œ", 1);
		map.put("¿Ã", 2);
		map.put("ªÔ", 3);
		map.put("¿œ", 4);
		map.put("ø¿", 5);
		
		Set<String> keys=map.keySet();
		Iterator<String> ite=keys.iterator();
		while(ite.hasNext()){
			String key=ite.next();
			System.out.println(key+" "+map.get(key));
			
		}
		
		
	}

}
