public class keypadcombination {
        static void combination(String dig,String[]kp,String res){
                if(dig.length()==0){
                        System.out.print(res+" ");
                        return; 
                }
                int currnum=dig.charAt(0)-'0';
                String currechoices =kp[currnum];
                for(int i=0;i<currechoices.length();i++){
                combination(dig.substring(1), kp, res+currechoices.charAt(i));
                }
        }

        public static void main(String[] args) {
                String dig ="23";
                String[] kp ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(dig, kp, "");
        }
}
