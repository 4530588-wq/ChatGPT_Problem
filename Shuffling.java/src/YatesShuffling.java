// Fisher Yates / Unbiased shuffling
import java.util.*;
public class YatesShuffling{
    public static int[] shuffle(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int r = i + (int)(Math.random() * (n-i));
            int temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;
        }
        return arr;
    }

}
