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
            arr.set(j+1,key);
        }
        System.out.println("Sorted array :\n " + arr.toString());
    }
    public static void fillList(ArrayList<Integer> arr){
        Scanner scan = new Scanner(System.in);
        int next;
        System.out.print("Enter ages , enter negative age to stop : ");
        next = scan.nextInt();
        while(next >= 0){
            arr.add(next);
            next = scan.nextInt();
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println("Results : ");
        fillList(ages);
        sort(ages);
    }
}