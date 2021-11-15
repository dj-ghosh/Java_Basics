package patterns;

import java.util.Scanner;

public class Star_Sandglass {

	public static void main(String[] args) {
		System.out.print("Enter the number of rows you want to print: ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		for (int i=1;i<=row;i++) {
			for (int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for (int j=1;j<=row-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=1;i<=row;i++) {
			for (int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close(); 
	}

}
