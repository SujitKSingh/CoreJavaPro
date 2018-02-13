class ExampleString
{
public static void main(String args[]) {
char chars[]= {65,66,67,68,69};

String s = new String(chars);
String s1=new String(s);
String s2= "This is a String " ; 

System.out.println(s);
System.out.println(s1);
System.out.println(s2);
System.out.println(s.length());
System.out.println(s1.charAt(0));

}
}