package pattern;

public class Number_17 {

	private static int input;

	public static void main(String[] args) {
		input = 9;
		for(int i=1;i<=input;i++) {   // Upper half
			for(int j=1;j<=i;j++) {	
				System.out.print(" ");
			}
			for(int j=i;j<=input;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=input-1;i>=1;i--) {  // Lower Half
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=input;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
