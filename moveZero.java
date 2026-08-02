public class moveZero {
  public static void movezero(int [] num){
        int insertpos =0;
        for(int i:num){
            if(i!=0){
                num[insertpos] =i;
              insertpos++;
            }
        }
        while (insertpos<num.length) {
                num[insertpos] =0;

                insertpos++;
        }
  }

static void printarr(int num[]){
        for(int i:num){
                System.out.print(" "+i);
        }
}



        public static void main(String[] args) {
                int [] num ={0,1,0,3,12};
        movezero(num);
        printarr(num);
        }
}