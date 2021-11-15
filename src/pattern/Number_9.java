package pattern;

public class Number_9 {

	private static int input;

	public static void main(String[] args) {
		input = 9;
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==0)   // If Odd place then 1 Else 0
				System.out.print("0");
				else
				System.out.print("1");
			}
			System.out.println();
		}

	}

}
