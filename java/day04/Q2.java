class Q2{

  public static void main(String[] args){

	System.out.println("for");	
	
	for(int i=(int)'A';i<=(int)'L';i++){
		for(int j=1;j<=4;j++){
		System.out.print((char)i+"\t");
		i++;
		}
		i--;
		System.out.println();
	}

	System.out.println("while");	
	int i=(int)'A';
	int j=1;
	while(i<=(int)'L'){
		while(j<=4){
			System.out.print((char)i+"\t");
		i++;
		j++;
		}
		j=1;
		System.out.println();
	}	

  }

}