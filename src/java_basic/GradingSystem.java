package java_basic;

public class GradingSystem {

	public static void main(String[] args) {
		int x = 0;
		if (x > 90) {
			System.out.println("excellent");
		}
		else if (x > 80 && x <=90) {
			System.out.println("good");
		}
		else if (x > 70 && x <=80) {
			System.out.println("fair");
		}
		else if (x > 60 && x <=70) {
			System.out.println("meets expectations");
		}
		else {
			System.out.println("below par");
		}



	}

}
