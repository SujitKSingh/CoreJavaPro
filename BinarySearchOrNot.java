import java.util.Arrays;
 
class BinarySearchOrNot 
{
  public static void main(String args[])
  {
    char characters[] = { 'a', 'b', 'c', 'd', 'e' };
 
    System.out.println(Arrays.binarySearch(characters, 'd'));
    System.out.println(Arrays.binarySearch(characters, 'p'));
  }
}
