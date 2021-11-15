package array;
import java.util.Arrays;
public class Array_Remove_Duplicate {

	public static void main(String[] args) {
		int arr[] = new int[] {2,3,3,3,5,1,2};
		/*int flag;
		for(int i = 0; i < arr.length; i++) {
			flag = 1;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					flag++;
					break;
				}
			}
			if(flag == 1)
				System.out.print(arr[i]+" ");
		}*/
		Arrays.sort(arr);
		//1 2 2 3 3 3 5 5
		int temp[] = new int[arr.length];
		int j = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] != arr[i+1]) {
				temp[j] = arr[i];
				j++;
			}
		}
		temp[j] = arr[arr.length - 1];
		for(int i = 0; i <= j; i++)
			System.out.print(temp[i]+" ");
	}

}
