package java_basic;

public class factorial {

	public static void main(String[] args) {
		int number = 4;
		int result = 1;
		System.out.print(number+"!"+" = ");
		for (int i=4;i>=1;i--) {
			result=result*i;
			System.out.print(i+"*");
			
		}
		System.out.print(" = "+result);

	}

}
