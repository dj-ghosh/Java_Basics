package patterns;

public class Star_Hollow_Down_Triangle {

	public static void main(String[] args) {
		int i,j,input=9;
		for (i=input;i>=1;i--) {
			for(j=1;j<=input-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=(2*i-1);j++) {
				if(j==1 || j==(2*i-1) || i==input)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
