public class perfect {
        static boolean checkperfectnumber(int num){
                int sum =1;
                for(int i=2;i*i<=num;i++){

                if (num%i ==0){
                        int firstFactor =i;
                        int secondfactor =num/i;
                        sum = sum+firstFactor+secondfactor;

                }
                        
                }if(sum==num){
                        return true;
                }else{
                        return false;
                }
        }
        
public static void main(String[] args) {
        System.out.println(checkperfectnumber(6));
}
        
}
