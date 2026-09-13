public class linearsearch {
        static boolean linearsearchinarr(int[]arr,int idx,int target){
               if (idx==arr.length) return false;
                if (arr[idx] ==target)     return true;
                return linearsearchinarr(arr,idx+1,target);
        }
        public static void main(String[] args) {  
                int arr []={10,20,15,45,23};
                int target=15;
               if (linearsearchinarr(arr,0,target)) {//==will known result true
                System.out.println("yes");
                 
               } else{
                System.out.println("No");
               }
        }
}
