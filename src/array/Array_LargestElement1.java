package array;

public class Array_LargestElement1 {

	public static void main(String[] args) {
		int array[] = new int [] {1,2,3,4,5};
		int max =array[0];
		for(int i =0;i<array.length;i++) {
			if(array[i]>max)
				max=array[i];
		}
		System.out.println("Largest Element in the given array: " + max);

	}

}
