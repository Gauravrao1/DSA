public class printsubsequences {
        static void printSSq(String s,String currAns){
                if (s.length()==0) {
                        System.out.println(currAns);
                        return;
                }
                char curr = s.charAt(0);
                String remaning =s.substring(1);
                //curr char → choose to be part of currAn
                printSSq(remaning, currAns+curr);//bc,a
                //curr char →not to be chooe of curr
                printSSq(remaning, currAns);//bc,""
        }

        public static void main(String[] args) {
              String s ="abc";
                printSSq(s, "");
        }
}
