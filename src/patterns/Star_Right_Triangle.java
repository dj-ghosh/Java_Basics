package patterns;

public class Star_Right_Triangle {

	public static void main(String[] args) {
		int input = 10;
		for (int i=0;i<input;i++) { // Outer loop for row
			for (int j=0;j<=i;j++) {	// Inner loop for column
				System.out.print("* "); // For Printing * in inner loop
			}
			System.out.println(""); // To move next line after each row
		}

	}

}
