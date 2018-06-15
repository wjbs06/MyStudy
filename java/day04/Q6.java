class Q6{

  public static void main(String[] args){

	System.out.println("for");	
	int k=1;
	for(int i=1;i<=6;i++){
		for(int j=1;j<=k;j++){
		System.out.print(i+"\t");
		i++;
		}
		k++;
		i--;
		System.out.println();
	}

	System.out.println("while");	

  }
}