public class Binarysearch {

    static boolean binarysearch(int arr[], int tar) {
        int str = 0;
        int end = arr.length - 1;

        while (str <= end) {

            int mid = (str + end) / 2;   // Recalculate every iteration

            if (arr[mid] == tar)
                return true; 

            if (arr[mid] > tar)
                end = mid - 1;
            else
                str = mid + 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 10, 15, 20, 25};
        int tar = 20;

        System.out.println(binarysearch(arr, tar));
    }
}
