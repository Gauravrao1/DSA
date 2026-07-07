/*There are N stones, numbered 0,1,2,...,N-1. For each i (0<i<N), the height of Stone i is hi. There is a frog who is initially on Stone 0. He will repeat the following action some number of times to reach Stone N-1:
If the frog is currently on Stone i, jump to Stone i+1 or Stone i+2.
Here, a cost of hi hj is incurred, where j is the stone to land on.
Find the minimum possible total cost incurred before the frog reaches Stone N.
Input n= 4
arr[]=10 30 40 20
Output= 30 */ 
public class frogjump {
        static int frogjumpsum(int arr [], int idx ,int n){
                if (n-1==idx)  return 0; 
          int op1 = Math.abs(arr[idx]-arr[idx+1])+frogjumpsum(arr, idx+1, n);
             if (idx ==n-2) return op1;

                 
             int op2=Math.abs(arr[idx]-arr[idx+2])+frogjumpsum(arr, idx+2, n);
             return Math.min(op1,op2);
        }
        public static void main(String[] args) {
                int [] arr ={10,30,40,20};
                System.out.println(frogjumpsum(arr, 0, arr.length));
                 
        }
}
