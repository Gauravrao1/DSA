public class maxarray {
        static int printarraymax(int arr[],int idx){
                if (idx==arr.length-1) return arr[idx]; 
                int smallans =printarraymax(arr, idx+1);
                return Math.max(arr[idx], smallans) ;
        } public static void main(String[] args) {
                int arr[] ={5,10,15,20};
               System.out.println( printarraymax(arr,0));
        }
}
