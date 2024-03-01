public class letter_lexicographycal_order {
    public static void main(String[] args) {
        char[] arr = { 'x','x','y','y' };
        char target = 'z';
        System.out.println(nextGreatestLetter(arr, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid;
        if(letters[letters.length-1] < target){
            return letters[0];
        }
        while (start <= end) {
            mid = (start + end) / 2;
            if (target >= letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start];
    }
}
