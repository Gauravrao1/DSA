public class makefractionclass {
public static  class fraction{
        int num;
        int den;
        public fraction(int num,int den){
                this.num =num;
                this.den =den;
        }

}
        public static void main(String[] args) {
        fraction f1 =new fraction(3,7);
        System.out.println(f1.num+"/"+f1.den);
     
    }    
}
