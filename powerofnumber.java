public class powerofnumber {
        static int powerofnum(int p,int q){
                if (p==1||q==0) return 1;
               return p*powerofnum(p,q-1); 
        }
        public static void main(String[] args) {
                int p=20;
                int q =2;
        System.out.println(powerofnum(p,q));
        }
}
