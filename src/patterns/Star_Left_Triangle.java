package patterns;

public class Star_Left_Triangle {

	public static void main(String[] args) {
		int number=7;
		for(int i=0;i<number;i++) {
			for(int j=0;j<2*(number-i);j++) { // Inner loop for space & multiplied by 2 as * has space so it need to cover 2 steps every time
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
