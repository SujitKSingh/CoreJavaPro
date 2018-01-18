import java.io.*;
import java.util.Scanner;

public class StringCharacterOccurence 
{
	public static void main(String[] args) throws IOException
	{ 
		String S;
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the Statement : ");
		S = scan.nextLine();
		
		int count=0,len=0;
		do
		{  
			try
			{
				char name[]=S.toCharArray();
				len=name.length;
				count=0;
				for(int j=0;j<len;j++)
				{
					if((name[0]==name[j])&&((name[0]>=65&&name[0]<=91)||(name[0]>=97&&name[0]<=123))) 
						count++;
				}
				if(count!=0){
					System.out.println(name[0]+" "+count+" Times");
				}
				S=S.replace(""+name[0],"");          
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		while(len!=1);
	}
}