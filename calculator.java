import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class calculator {
	public static void main(String arg[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		String s="";
		Calculation cal=new Calculation();
		do
		{
		System.out.println("Menu");
		System.out.println("1)Sum");
		System.out.println("2)Sub");
		System.out.println("3)Mul");
		System.out.println("4)Div");
		
		System.out.print("\n\nEnter your choice:-");
		int ch=sc.nextInt();
		
		if(ch>=1&&ch<=4)
		{
		System.out.print("A=");
		cal.setA(sc.nextInt());
		System.out.print("B=");
		cal.setB(sc.nextInt());
		}
		switch(ch)
		{
		case 1:System.out.println("Sum="+cal.sum());
		break;
		case 2:System.out.println("Sub="+cal.sub());
		break;
		case 3:System.out.println("Mul="+cal.mul());
		break;
		case 4:if(cal.div()==0)
				{
					System.out.println("Div=Infinite");
				}
			else
			{
				System.out.println("Div="+cal.div());
			}
		break;
		default:System.out.println("Invalid choice !!");
		}
		
		System.out.println("Do you want to continue ? Y/N:-");
		s=br.readLine();
		}while(s.toUpperCase().equals("Y"));
		sc.close();
	}

}
