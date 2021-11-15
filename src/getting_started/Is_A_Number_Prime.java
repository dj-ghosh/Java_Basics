package getting_started;

public class Is_A_Number_Prime {

	public static void main(String[] args) {
	int number = 5;
	int count = 0;
	if ((number==0)||(number==1)) {  // To check if number is 0 or 1
		System.out.println("It's not a prime");
	
	}
	else {
		for(int i = 2;i<=number/2;i++) {  // Run up to 50 % to reduce  execution time
			if(number%i==0) {
				count++;
				if(count>0) { // To reduce execution further check if count greater than 1
					System.out.println("It's not a prime");
				
					break;
				}
			}
			
		}
		if(count==0) { 
			System.out.println("It's a prime");
		
		}
	}

	}

}
