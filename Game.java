import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Random rnd=new Random();
		Scanner sc=new Scanner(System.in);
		int r=rnd.nextInt(25)+1,u,chance=5;
		boolean f=false;
		
		do
		{
			System.out.println("Chances left:-"+chance);
			System.out.println("Gusse my no be:-");
			u=sc.nextInt();
			
			if(u==r)
			{
				f=true;
				break;
			}
			else if(u>r)
			{
				System.out.println("You no is greater than mine !\n\n\n Try Again !");
				chance--;
			}
			else
			{
				System.out.println("You no is lesser than mine !\n\n\n Try Again !");
				chance--;
			}
			
		}while(chance!=0);
		if(f)
		{
			System.out.println("You won!!!!!");
		}
		else
		{
			System.out.println("You Loss!!! \nMy no was:-"+r);
		}
sc.close();
	}

}
