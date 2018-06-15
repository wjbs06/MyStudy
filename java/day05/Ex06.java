class Ex06{
  public static void main(String[] args){
//메서드의 오버로드에 대한 내용. 인자가 중요
	int a=100;
	System.out.println(a);
	func01(true);
	func01(100);	
	System.out.println(a);
  }//main end

  public static void func01(){
	int a=1;
	func02(100);
	System.out.println(a);
	//return;
  }//func01 end

  public static int func01(boolean a){
	if(a=true){
	System.out.println(a);
	};
	return 1000;
  }//func01 end



  public static void func01(int b){
	int a=1;
	func02(100);
	System.out.println(a+"\t"+b);
	//return;
  }//func01 end


  public static void func02(int a){
	System.out.println("func02 run"+a);
	//return;
  }//func02 end

  
}//class end