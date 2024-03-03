public class first_last_in_sorted_array {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 5, 5, 6, 6, 7, 8, 9 };
        int[] arr = searchRange(nums, 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int[] searchRange(int[] nums, int target) {

        int[] arr = { -1, -1 };
        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else {
                arr[0] = mid;
                start = 0;
                end = mid - 1;
            }
        }

        start = 0;
        end = nums.length - 1;

        while (start <= end) {
            mid = (start + end) / 2;
            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else {
                arr[1] = mid;
                start = mid+1;
                end = nums.length-1;
            }
        }

        
        return arr;
    }
}
