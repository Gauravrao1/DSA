//Find the first occurrence of a given element x, given that the given array is sorted. If no occurrence of x is found then return -1.
//Input
// arr[25, 5, 6, 6, 8, 9, 9, 9]
//x=5
//output 1
public class problem_1_binarysearch {
static boolean elementsearch(int[]arr,int n,int mid,int  str,int end,int tar){
 str =0;
 end =n;
 mid=str+(str-end)/2;

 while (str<=end) {
        mid=str+(end-str)/2;
        if(arr[mid]==tar){
          return true;  
        }
        else if(arr[mid]<tar){
        str=mid+1;
        }
        else
         end =mid-1;
        
 }
return false;
}
   








public static void main(String[] args) {
                int arr[] ={25,5,6,6,8,9,9,9};
                int n =arr.length-1;
                int tar=5;
                if (elementsearch(arr, n, tar, tar, n, tar)) System.out.println("1");
                else System.out.println("-1");
        }
}
