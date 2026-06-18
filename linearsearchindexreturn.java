public class linearsearchindexreturn {
        static int printindex(int []arr,int idx, int target){
                if (idx>=arr.length) return -1;
                if(arr[idx]==target) return idx;                     
                return printindex(arr, idx+1, target);
        }
        public static void main(String[] args) {
                int arr []={10,15,20,14};
                int idx = 0;
                int target =15;
                System.out.println("index of target element "+printindex(arr, 0, target));
        }
}
