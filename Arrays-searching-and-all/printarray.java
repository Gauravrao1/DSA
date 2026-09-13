//printarray 
public class printarray {
        static void printarraynum(int arr[],int idx){
                if(idx ==arr.length){
                         return;
                        }
        System.out.print(arr[idx]+" ");
        printarraynum(arr, idx+1);


        }
        public static void main(String[] args) {
                int arr[] ={5,10,15,20};
                printarraynum(arr,0);
        }
        
}
