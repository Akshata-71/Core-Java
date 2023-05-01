import java.util.Scanner;
class Football
{
	String name;
	int player;
	int win;
	int loss;
		

	public void scoreCalc()
	{
		
		System.out.println("Name : " + name);
		System.out.println("Player : " + player);
		System.out.println("Match Win : ");
		System.out.println("Match Loss : " + loss);
		int score = (win * 10) + (loss  * -5);
		System.out.println("**************************");
		System.out.println("Score of the team is : " + score);
	
	}

}




class Object7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Football f1 = new Football();
		System.out.println("Enter name of the team : ");
		f1.name = sc.nextLine();
		System.out.println("Enter number of players in the teram : ");
		f1.player = sc.nextInt();
		System.out.println("Number of match WIN : ");
		f1.win = sc.nextInt();
		System.out.println("Number of matches LOSS");
		f1.loss = sc.nextInt();
		System.out.println("__________________________");
		
		
		f1.scoreCalc();




	}	

}