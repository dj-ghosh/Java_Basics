package patterns;

public class Star_Mirrored_Right_Triangle {

	public static void main(String[] args) {
		int row = 6;
		for (int i=0;i<row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
