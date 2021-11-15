package ascii;
import java.util.Scanner;
public class Four {
	private static Scanner sc;

	public static void main(String args[]) {
		System.out.println("Enter a character");
		sc = new Scanner(System.in);
		char chr = sc.next().charAt(0);
		int asciivalue = chr;
		System.out.println("THe ASCII Value of "+chr+" is "+asciivalue);
	}
}
