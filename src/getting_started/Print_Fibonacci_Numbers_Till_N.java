package getting_started;

public class Print_Fibonacci_Numbers_Till_N {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int n = 10;
		if((n>1) && (n<40)) {
			System.out.println(a);
			System.out.println(b);
		for (int i =1;i<=n-2;i++) {
			int c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}
		
		
		}
		else if(n==1) {
			System.out.println(a);
		}
		else {
			System.out.println("Out of range, input value from 1 to 39");
		}
		

	}

}
