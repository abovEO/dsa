
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
            buckets[val].add(value);
        }

        for(List<Float> bucket: buckets){
            Collections.sort(bucket);
        }

        int index = 0;
        for (List<Float> bucket : buckets) {
            for (float value : bucket) {
                arr[index++] = value;
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = {0.78f, 1.2f, 0.23f, 0.43f};
        bucketSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
