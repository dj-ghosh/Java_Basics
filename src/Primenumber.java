// To check a number prime or not
public class Primenumber {

	private static int input,i,flag,m;

	public static void main(String[] args) {
		input = 2;
		m = input/2;
		System.out.println(m);
		
		if(input==0||input==1)
		{
			System.out.println("Not a prime");
			
		}
		else {
			for(i=2;i<=m;i++) {    // in 50% of journey for non prime will get divided anyways
				if(input%i==0) {   // But for Prime i needs to reach till last i.e. itself but
					flag=1;		   // that is never reached so flag remains zero.
					break;
				}
				}
			if(flag==0) {
				System.out.println("Prime");
				System.out.println(flag);
			}
			else {	System.out.println("Not a prime time");
			System.out.println(flag);
				}
			}
		}
		

	}
