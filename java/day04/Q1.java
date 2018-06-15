class Q1{

  public static void main(String[] args){
	System.out.println("for");
	for(int i=1;i<=4;i++){
		for(int j=1;j<=4;j++){
		System.out.print("¡Ù");
		}
		System.out.println();
	}
	System.out.println("while");
	int i=1;
	int j=1;
	while(i<=4){
		j=1;
		while(j<=4){
			System.out.print("¡Ù");
		j++;
		}

		System.out.println();
		i++;
	}

  }

}