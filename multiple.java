public class multiple {
static void printmutiple(int n,int k){
        if (k==1) {
                System.out.println(n);
                return;
        }
        printmutiple(n, k-1);
        System.out.println(n*k);
}
        public static void main(String[] args) {
                int n =5;
                int k=5;
                printmutiple(n,k);
        }
}
