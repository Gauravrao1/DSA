/*Given an integer array arr, move all O's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
Input:
050342
Output:
5 3 4 2 0 0
42
53*/
public class sortingAlgoq1 {
       static void endzero(int arr[]){
        int n =arr.length;
        for(int i =0;i<n-1;i++){
                for(int j=0;j<n-i-1;j++){
                 if (arr[j]==0&&arr[j+1]!=0) {
                        int temp =arr[j];
                        arr[j] =arr[j+1];
                        arr[j+1]=temp;
                 }
                }
        }
       }
    public static void main(String[] args) {
        int arr[]={0,5,0,0,3,4,2};
        endzero(arr);
        for (int i  : arr) {
         System.out.print(i+" ");   
        }
    }    
}
