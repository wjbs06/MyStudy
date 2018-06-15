class Q3{

  public static void main(String[] args){

	System.out.println("for");	
	
	for(int i=1;i<=12;i++){
		for(int j=1;j<=4;j++){
		System.out.print(i+"\t");
		i++;
		}
		i--;
		System.out.println();
	}

	System.out.println("while");	
	int i=1;
	int j=1;
	while(i<=12){
		while(j<=4){
			System.out.print(i+"\t");
		i++;
		j++;
		}
		j=1;
		System.out.println();
	}	

  }

}