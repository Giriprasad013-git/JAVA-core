import java.util.Arrays;

public class largestsmallest {
    public static void main(String args[]){
        int arr[]={5,6,3,2,4};
        Arrays.sort(arr);
        System.out.println("Second smallest"+arr[1]+"\nSecond Largest"+arr[arr.length-2]);
    }
}