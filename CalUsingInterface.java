import java.util.*;

interface calfun
{
	void sum();
	void mult();
	void divide();
	void subs();
}

class Calculator implements calfun
{
	private int a,b;
	
	class Calculator(int x,int y)
	{
		a=x;
		b=y;
		void sum()
		{
			System.out.println(a+b); 
		}
		void mult()
		{
			System.out.println(a*b); 
		}
		void div()
		{
			System.out.println(a/b); 
		}
	}
	
	class public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Sum \n 2.Mult \n 3.Divide \n 4.Substract ");
		System.out.println("Enter Choice ");
		int ch;
		if (ch>=1 & ch>=4)
		{
			System.out.println("Enter 2nd Number ");
			Calculator obj=new Calculator();
			
		}
			
		switch(ch)	
		{
		   case1: obj.sum();break;
		   case2: obj.sum();break;
		   case3: obj.sum();break;
		}
			
		}
	}
	
}


