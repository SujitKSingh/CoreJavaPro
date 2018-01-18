
import java.util.Scanner;

public class BigSmallAMongThree {
	public static void main(String [] args )
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers ");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		if(a>b && a>c)
			System.out.println("a is the largest among three");
		else
		if (b>c && b>a)
			System.out.println("b is the largest among three");
		else if (c>a && c>b)
			System.out.println("c is the largest among three");
		else 
			System.out.println("Numbers are same");
		sc.close();
	}

}