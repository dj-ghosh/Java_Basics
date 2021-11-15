package array;

public class Array_Even_Position {

		public static void main(String[] args) {
			int array[] = new int [] {1,2,3,4,5,6};
			int max = array[0];
			for (int i=0;i<array.length;i++) {
				if (i%2!=0)
					System.out.println("THe largest element is "+array[i]);
				}
			
			}
		}
