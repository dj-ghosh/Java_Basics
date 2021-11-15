package pattern;

public class Star_Right_Down_Mirror {
	
	private static int input;

	public static void main(String[] args) {
		input = 10;
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("  "); //Use two space for aligning as Right Angle triangle
			}
			for(int j=1;j<=input-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
