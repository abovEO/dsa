public class floor_of_number {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 7, 9, 11, 13, 14, 17, 19, 21 };
        int result = floor(arr, 2);
        System.out.println(result);
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int mid;

        while(start <= end){
            mid = (start + end)/2;
            if(target <= arr[mid]){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return arr[end];
    }
}