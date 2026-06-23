/*Given an array of integers, print sums of all subsets in it. Output sums can be printed in any order.
Input: arr[] = {2,3}
Output: 0235
Input: arr[] = {2, 4, 5}
Output: 0245679 11
 */
public class Subset {
        static  void subarrayprintsum(int []a,int n,int idx ,int currsum){
                if (idx >=n) {
                 System.out.println(currsum);
                 return;
                }

                subarrayprintsum(a, n, idx+1,currsum+a[idx]);
                subarrayprintsum(a, n, idx+1, currsum);
        }
        public static void main(String[] args) {
                int [] a ={2,4,5};
                int n = a.length;
                subarrayprintsum(a, n, 0, 0);
        }
}
