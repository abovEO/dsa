public class peak_index_mountain_array {
    public static void main(String[] args) {
        int[] arr = {0,1,3,4,6,7,6,5,4,3,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {

        int start = 1;
        int end = arr.length-2;
        int mid;

        while(start <= end){
            mid = (start + end)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] >arr[mid+1]){
                return mid;
            } else if(arr[mid] < arr[mid+1]){
                start= mid+1;
            } else{
                end = mid-1;
            }
        }
        return -1;
    }   
}