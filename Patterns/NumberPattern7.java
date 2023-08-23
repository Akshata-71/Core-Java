/*
1
23
345
4567
56789


*/


class NumberPattern7{
	public static void main(String[] args){
		int num =1;
		for(int i=0; i<5;i++){
			int temp =num;
		
			for(int j=0; j<=i ;j++){
				System.out.print(temp);
				temp++;

			}
			System.out.println();
			num++;
		}

	}

}