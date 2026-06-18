//Given an array of size N andninteger X.the task is to find all idices of integer x in the array

public class findallindices {
        static void findallindicesnum(int arr[],int n,int target,int idx){
                if(idx>=n){
                        return;
                }
                if(arr[idx]==target){
                System.out.println(idx);}

                findallindicesnum(arr, n, target, idx+1);
        }
        public static void main(String[] args) {
                int arr []={1,2,3,2,2,5};
                int target=2;
                int n =arr.length;
                int idx=0;
                findallindicesnum(arr, n, target, idx);
        }
        
}
