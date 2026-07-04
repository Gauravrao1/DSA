//Find the sum of the element of the array [2,3,5,20,1]
import java.util.*;
public class sumofarray {
        static int sumofarray(int arr[],int idx){
                 if (idx ==arr.length-1) {
                return arr[idx];
                }
               return arr[idx]+sumofarray(arr, idx+1);
        }
        public static void main(String[] args) {
                int arr []={2,3,5,20,1};
                int result = sumofarray(arr,0);
                System.out.println("Sum ="+ result);
        }
}
   
