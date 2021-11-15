package getting_started;

public class Print_All_Primes_Till_N {

	public static void main(String[] args) {
	int lower = 0; // Starting Number
	int higher =7; // Ending Number
	int count = 0;
	for(int input = lower;input<=higher;input++) {
		if ((input==0)||(input==1)) {  // To check if number is 0 or 1
			System.out.println(input+" It's not a prime");
		
		}
		else {
			for(int i = 2;i<=input/2;i++) {  // Run up to 50 % to reduce execution time
				if(input%i==0) {
					count++;
					if(count>0) { // To reduce execution further check if count greater than 1	
						break;
					}
				}
				
			}
			if(count>0) { 
				System.out.println(input+" It's not a prime");
			}
			else {
				System.out.println(input+" It's a prime");
			}
			count=0; //Reset the counter for the next number
		}
	}

	}

}