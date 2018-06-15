package com.bit.pm;

public class Ex01 {
	private int serial=123456789;
	
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException{
		Object obj=new Object();
		Ex01 me=new Ex01();
		Ex01 me2=new Ex01();
//		Object obj2=me.clone();
		System.out.println(me);
		System.out.println(me==me2);
		System.out.println(me.equals(me2));	
		
		Class cl1=obj.getClass();
		Class cl2=obj.getClass();
		System.out.println(cl1.getCanonicalName());
		System.out.println(cl1.getName());
		//java.lang.Object
		//com.bit.pm.Ex01
		Class temp=Class.forName("java.lang.Object");
		System.out.println(temp.getName());
		Object obj1=temp.newInstance();
		System.out.println(obj1.hashCode());
		Class temp1=Class.forName("com.bit.pm.Ex01");
		System.out.println(temp1.getName());
		Object obj2=temp1.newInstance();
		Ex01 me3=(Ex01) obj2;
		System.out.println(me3.serial);
	}
	public String toString() {
		return this.serial+"";
	}
	public boolean equals(Object obj) {
//		return this.serial==((Ex01)obj).serial;
//	}
		return this.hashCode()==obj.hashCode();
	}
	public int hashCode() {
		return this.serial;
	}
}
