import java.util.*;
public class SortingArrayList {


    public static void sort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            int key = arr.get(i);
            int j = i - 1;
            while (j >= 0 && arr.get(j) > key) {
                Collections.swap(arr, j + 1, j);
                j--;
            }
            Collections.swap(arr, j + 1, key);
        }
        System.out.println("Sorted array :\n " + arr.toString());
    }
    
}