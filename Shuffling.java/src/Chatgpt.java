/**Your task is to:
 Shuffle the array using the Fisher-Yates algorithm
 Sort the shuffled array (you can use any sorting method)
 Then perform a Binary Search to find a given target value
 Return the index of the target in the sorted array, or -1 if not found */
import java.util.*;
public class Chatgpt {
    public static int[] shuffle(int[] arr){
        int n= arr.length;
        for(int i= 0; i<n; i++){
            int r = i + (int)(Math.random() * (n-i));
            int temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;
        }
        return arr;
    }
    public static int[] sort(int[] arr){
        for(int i=1; i<arr.length;i++){
            int key = arr[i];
            int j = i - 1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    public static int search(int[] arr,int low,int high,int target){
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the target value : ");
        int target = scan.nextInt();
        int[] ages = {10,19,65,20,22,63,33,100,6,27,5};
        int[] shuffledSortedAges = sort(shuffle(ages));
        int size = shuffledSortedAges.length;
        int index = search(shuffledSortedAges,0,size-1,target);
        System.out.println("The shuffled and sorted array : "+ Arrays.toString(shuffledSortedAges));
        System.out.println("The index of the value "+target+" is "+index);
        scan.close();
    }
}