
public class Calculation 
{
	private int a,b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int sum()
	{
		return this.a+this.b;
	}
	public int sub()
	{
		return this.a-this.b;
	}
	public long mul()
	{
		return this.a*this.b;
	}
	public double div()
	{
		if(this.b==0)
		{
			System.out.println("Infinite");
			return 0;
		}
		else
		{
			return (double)this.a/this.b;
		}
	}
}
