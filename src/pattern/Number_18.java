package pattern;

public class Number_18 {

	private static int input;

	public static void main(String[] args) {
		input = 8;
		for(int i=1;i<=input;i++) {
			for(int j=input-i;j>=1;j--) {
				System.out.print("1");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
