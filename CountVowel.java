
class CountVowel {

	public static void main(String[] args) {
            String s="This is avery sunny nice day " ;
            int vowelcount=0;
            for(int i=0;i<=s.length()-1;i++)
            	if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            	{
            		vowelcount++;
            	}
            System.out.println("No of Vowels"+vowelcount);
	}

}
