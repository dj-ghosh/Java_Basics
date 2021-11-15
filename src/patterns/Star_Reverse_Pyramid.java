package patterns;

public class Star_Reverse_Pyramid {

	public static void main(String[] args) {
		int number = 7;
		for (int i=0;i<number;i++) {
			for (int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for (int j=0;j<number-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
