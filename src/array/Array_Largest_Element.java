package array;

public class Array_Largest_Element {

	public static void main(String[] args) {
		int array[] = new int [] {1,2,3,4,5,6,9,8,7,5};
		int max = array[0];
		for (int i=1;i<array.length;i++) {
			if (max<array[i])
				max=array[i];
			}
		System.out.println("THe largest element is "+max);
		}
	}
