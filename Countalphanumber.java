public class Countalphanumber {
    
 public static void main(String[] args) {
		String test = "azA$98";
		count(test);
	}
	public static void count(String x)
		{
			char[] ch = x.toCharArray();
			int letter = 0;
			int num = 0;
			for(int i = 0; i < x.length(); i++){
				if(Character.isLetter(ch[i])){
					letter ++ ;
					}
				else if(Character.isDigit(ch[i])){
				num ++ ;
			}
			
		}
		System.out.println("azA$98");
		System.out.println("letter: " + letter);
		System.out.println("number: " + num);
			}
}
