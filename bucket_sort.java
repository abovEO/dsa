
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bucket_sort {

    public static void bucketSort(float[] arr) {
        int n = arr.length;
        if (n < 1) {
            return;
        }

        List<Float>[] buckets = new ArrayList[n];

        for (int i = 0; i < arr.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        
        for (float value : arr) {
            int val = Math.min((int)(value * n), n - 1);
            insertSorted(buckets[val], value);
        }

        int index = 0;
        for (List<Float> bucket : buckets) {
            for (float value : bucket) {
                arr[index++] = value;
            }
        }
    }

    private static void insertSorted(List<Float> list, float value) {
        int i = 0;
        while (i < list.size() && list.get(i) < value) {
            i++;
        }
        list.add(i, value); 
    }

    public static void main(String[] args) {
        float[] arr = {0.78f, 1.2f, 0.23f, 0.43f, 100f, 120f, 32f, 41f};
        bucketSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
