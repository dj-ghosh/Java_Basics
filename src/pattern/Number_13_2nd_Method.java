package pattern;

public class Number_13_2nd_Method {

	@SuppressWarnings("unused")
	private static int input;

	public static void main(String[] args) {
		input = 9;
		for(int i=9;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
