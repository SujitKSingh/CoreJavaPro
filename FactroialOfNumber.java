
import java.util.Scanner;

public class FactroialOfNumber {

	private static int facRecursive(int number) {
		if (number == 0)
			return 1;
		return number * facRecursive(number - 1);
	}

	public static void main(String[] args) {
			/* Calculate factorial for input number */
			System.out.printf(" Enter input number : ");
			Scanner scanner=new Scanner(System.in);
			int number = scanner.nextInt();
			int facNumber = facRecursive(number);
			System.out.printf("factorial(%d) - Recursive method: %d\n",number,facNumber);
			scanner.close();
		}
	}