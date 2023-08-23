/*
1
3       5
5       7       9
7       9       11      13
9       11      13      15      17
*/

class NumberPattern8{
	public static void main(String[] args){
		int num =1;
		for(int i=0; i<5;i++){
			int temp =num;
		
			for(int j=0; j<=i ;j++){
				System.out.print(temp +"\t");
				temp+=2;

			}
			System.out.println();
			num+=2;
		}

	}

}