/*Search the 'target' value in a 2d integer matrix of dimensions n x m and return true if found, else return false.
This matrix has the following properties:
1. Integers in each row are sorted from left to right.
2. The first integer of each row is greater than the last integer of the previous row.
Input:
Matrix [[1,3,5,7], [10,11,16,20], [23,30,34,60]], target = 3
Output:
true */

public class twodproblembinarysearch {
public static boolean searchMatrix(int[][] a, int target) {
        int n = a.length,m =a[0].length;
        int st =0,end =n*m-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            int midelm=a[mid/m][mid%m];
           
            if(midelm ==target) return true;
            if(target<midelm) end =mid-1;
            else st =mid+1;
        }return false;
    }

 public static void main(String[] args) {
int [] [] a ={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
int target =65;

       System.out.println(searchMatrix(a,target)); 
}

        
}
