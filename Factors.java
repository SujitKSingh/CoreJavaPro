
import java.util.*;
 
public class Factors {
		public static void main(String[] args) 
		{
			Scanner sc= new Scanner(System.in);
			int n, i;
			System.out.println("Please Enter any number to Find Factors: ");
			n = sc.nextInt();
		
			for(i = 1; i <= n; i++) 
			{
				if(n%i == 0) 
				{
				System.out.format(" %d  ", i);
				}
			}
			sc.close();
		}
	}