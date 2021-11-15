package patterns;

public class Star_Hollow_Triangle {

	public static void main(String[] args) {
		int i,j,input=9;
		for(i=1;i<=input;i++) {
			for(j=i;j<input;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=2*i-1;j++) {
				if((j==1 || i==input) || j==(2*i-1)){
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");	
				}
			}
			System.out.println();
		}

	}

}