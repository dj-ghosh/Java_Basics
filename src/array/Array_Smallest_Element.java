package array;

public class Array_Smallest_Element {

    public static void main (String[] args){
        int array[] = new int [] {5,5,7,9,1,2,4};
        int min = array[0];
        for(int i=1;i<array.length;i++){
         if(array[i]<min)
             min=array[i];
        }
        System.out.println("The smallest element is "+min);

    }
}
