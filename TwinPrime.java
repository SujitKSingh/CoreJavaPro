import java.util.Scanner;

public class TwinPrime
{ 
 boolean isPrime(int n) //funton for checking prime
 {
 int count=0;
 for(int i=1; i<=n; i++)
 {
 if(n%i == 0)
 count++;
 }
 if(count == 2)
 return true;
 else
 return false;
 }

 public static void main(String args[]) 
 {
 TwinPrime ob = new TwinPrime();
 Scanner sc = new Scanner(System.in);
 
 System.out.print("Enterlower range value : ");
 int m = sc.nextInt();
 System.out.print("Enterupper range value: ");
 int h = sc.nextInt();
 
 if(m>h)
 System.out.println("Invalide !");
 else
 {
 System.out.println("nThe Prime Numbers within the given range are : ");
 for(int i=m; i<=(h-2); i++)
 {
 if(ob.isPrime(i) == true && ob.isPrime(i+2) == true)
 {
	 System.out.print("("+i+","+(i+2)+") ");		 }
 }
 }
 sc.close();

 }
}