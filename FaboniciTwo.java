class FaboniciTwo
{
	public static void main (String[] args)
	{
		int value1 = 0,value2 = 0;
		value2++;
		
		for(int i=0;i<10;i++){
				System.out.println(value1);
				System.out.println(value2);
		    
				value1=value1+value2;
				value2=value1+value2;
				
				}	
	}
}
