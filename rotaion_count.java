public class rotaion_count {
    public static void main(String[] args) {
        int[] arr = { 2,2,2,9,2,2};
        int result = rotations(arr);
        System.out.println(result);
    }

    static int rotations(int[] arr){
        int start = 0;
        int end = arr.length -1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid+1;
            } else if (start < mid && arr[mid] < arr[mid - 1]) {
                return mid;
            } else if (arr[mid] > arr[start]) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return 0;
    }

}
