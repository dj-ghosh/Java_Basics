package pattern;

public class Number_16 {

	private static int input;

	public static void main(String[] args) {
		input = 9;
		for(int i=input;i>=1;i--) {	//Prints upper half  pattern  
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=2;i<=input;i++) {  //Prints lower half  pattern  
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
