//Given an array where all its elements are sorted in increasing order except two swapped elements, sort it in linear time. Assume there are no duplicates in the array.
//Input: A[] = [3, 8, 6, 7, 5, 9, 10]
//Output: A[] = [3, 5, 6, 7, 8, 9, 10]

public class problembasedonsorting {
        static void sortArr(int []num){
                int n= num.length;
                int x =-1,y=-1;
        if(n<=1){
                return;
        }
        for(int i=1;i<n;i++){
                if(num[i-1]>num[i]){
                  if(x==-1){
                     x=i-1;
                     y=i;
                  }else{
                        y=i;
                  }
                }
                }
                int temp =num[x];
                num[x] =num[y];
                num[y] =temp;
        }
        static void  printnum(int[] num){
                for (int i  :num ) {
                       System.out.print(i+" "); 
                }
        }
    public static void main(String[] args) {
        int []num ={10,5,6,7,8,9,3};
        sortArr(num);
        printnum(num);
    }    
}
