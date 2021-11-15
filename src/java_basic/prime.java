package java_basic;

public class prime {
	
	private static int flag;
	public static void main(String[] args) {
		int number = 36;
		int halfnum = number/2;
		
		if (number == 0 || number == 1) {
			System.out.println("It's not a prime number");
		}
		else {
			for (int i=2;i<=halfnum;i++) {
				if(number%i==0) {
					flag++;
					//break;
				}
			}
			if (flag==0) {
				System.out.println("It's a prime number");
				System.out.println(flag);
			}
			else {
				System.out.println("It's not a prime number");
				System.out.println(flag);
			}
		}
		
	}

}
