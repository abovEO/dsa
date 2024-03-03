public class pivot_point {
    public static void main(String[] args) {
        int[] arr = { 7,5,3,2,0,1 };
        int result = search(arr, 1);
        System.out.println(result);
        // System.out.println(binarySearch(arr, 1, 0, 0));
    }

    static int search(int[] nums, int target) {
        int pivot = pivotPoint(nums);
        int result = binarySearch(nums, target, 0, pivot);
        if (result == -1) {
            result = binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
        return result;
    }

    static int pivotPoint(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (start < mid && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] > arr[start]) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return 0;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
