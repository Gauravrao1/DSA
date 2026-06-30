public class quicksort {
    static void displayarr(int[]arr){
        for(int i:arr){
                System.out.print(i+" ");
        }
    }
    static void swap(int[]arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
static void quicksort1(int[]arr,int st,int end){
         if(st>=end) return;
         int piv =partiotion(arr,st,end);
         quicksort1(arr, st, piv-1);
         quicksort1(arr, piv+1, end);
    }
static int partiotion(int[]arr,int st,int end){
        int pivot =arr[st];
        int count =0;
for(int i=st+1;i<end;i++){
        if (arr[i]<=pivot) count++;
}
int pividx=st+count;
swap(arr, st, pividx);
int i=st,j=end;
///elements lesser or equal left of pividx ,greater ->right side pivot idx
while(i<pividx&&j<pividx){
        while (arr[i]<=pivot) i++;
        while(arr[j]>pivot) j--;
if(i<pividx&&j>pividx){swap(arr, i, j);
        i++;
        j--;
            
}
}


return pividx;
}
    public static void main(String[] args) {
        int []arr ={6,3,1,5,4};
        System.out.println("Array before sorting");
        displayarr(arr);


         quicksort1(arr, 0, arr.length);
System.out.println(" ");
        System.out.println("Array After sorting");
        displayarr(arr);
     }   
}
