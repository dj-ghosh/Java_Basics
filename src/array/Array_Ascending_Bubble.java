package array;

public class Array_Ascending_Bubble {

	public static void main(String[] args) {
		int arr[] = new int[] {2,3,5,1};
		int temp = 0;
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+"\t");
	}
}
