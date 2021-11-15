package array;

public class Array_Left_Rotate {

	public static void main(String[] args) {
		int [] arr1 = new int [] {1,2,3,4,5,6};
		int [] arr2 = new int [arr1.length];
		int rotate =5;
		int count=0;
		for(int i=rotate;i<arr1.length;i++) {
			for(int j=i-rotate;j<arr1.length-rotate;j++) {
				arr2[j]=arr1[i];
			}
			count++;
		}
		for(int i=0;i<rotate;i++) {;
			for(int j=count;j<arr1.length && i < rotate;j++,i++) {
				arr2[j]=arr1[i];
			}
		for(int k=0;k<arr2.length;k++) {
			System.out.println(arr2[k]);
		}
	}
}
}
