package patterns;

public class Star_Diamond_Shape {

	public static void main(String[] args) {
		int row = 8;
		for(int i=0;i<row-1;i++) { // row-1 because last line was printing double
			for (int j=0;j<=row-i-1;j++) {// row-i-1 because 1 step space need to decrease more for aligning with second half
				System.out.print(" ");
			}
			for (int j=0;j<=2*i;j++) { // As 
				System.out.print("*");
			}
			System.out.println();
		}
		
		  for (int i=0;i<row;i++) { 
			  for (int j=0;j<=i;j++) { 
				  System.out.print(" ");}
		  for (int j=0;j<=2*(row-i-1);j++) { 
			  System.out.print("*");
			  }
		  System.out.println();
		  }
		 

	}

}
