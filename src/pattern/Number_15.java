package pattern;

public class Number_15 {

	@SuppressWarnings("unused")
	private static int input,j,i;

	public static void main(String[] args) {
		input = 9;
		for(i=1;i<=input;i++){
			for(j=1;j<=i;j++) {   // For the first part which is incremented digits
				System.out.print(j+" ");
			}
				for(j=i-1;j>=1;j--) { //For the second part decremented digits
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}

	}
