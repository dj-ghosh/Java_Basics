package pattern;

public class Number_20 {

	public static void main(String[] args) {
		int input =9;
		for(int i=1;i<=input;i++) {
			for(int j=i;j<=input;j++) {		// For first part
				System.out.print(j+" ");
			}
			for(int j=1;j<=i-1;j++) {		// For second part
				System.out.print(j+" "); 
			}
			System.out.println();
		}

	}

}
