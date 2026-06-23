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
