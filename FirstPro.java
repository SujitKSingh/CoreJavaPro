import java.util.Scanner;

class FirstPro
{
	int c,d;
	float e;
	
	
	void addition(int x,int y)
	{
	 c=x+y;
	}
	void mult(int x,int y)
	{
	 d=x*y;
	}
	void div(float x,float y)
	{
	 e=x/y;
	}
	
	
public static void main(String[] args)
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
a=sc.nextInt();
System.out.println("Enter second number");
b=sc.nextInt();
FirstPro r=new FirstPro();
r.addition(a,b);
r.mult(a,b);
r.div(a,b);

System.out.println("Addition of two numbers is : "+r.c);
System.out.println("MUltiplication of two numbers is : "+r.d);
System.out.println("Division of two numbers is : "+r.e);

sc.close();
}

}