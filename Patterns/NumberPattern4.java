class NumberPattern4{
	public static void main(String args[]){
		
		for(int i=1;i<=5;i++){
			int n=2; 
			for(int j=1;j<=5;j++){
			
				System.out.print(n);
				if(j<3)
					n--;
				else
					n++;	
			}
		System.out.println("");
		}
	}
}