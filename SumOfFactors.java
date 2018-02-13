import java.io.*;

class SumOfFactors
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader reader=new InputStreamReader(System.in);
        BufferedReader input=new BufferedReader(reader);
        System.out.println("PLEASE INPUT THE NUMBER");
        int n=Integer.parseInt(input.readLine());
        int i=1;
        int sum=0;
        while(i<=n)
        {
            if(n%i==0)
            sum=sum+i;
            i++;
        }
        System.out.println("SUM OF FATORS OF "+n+" ARE:"+sum);
    }
}