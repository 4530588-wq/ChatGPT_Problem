/** Reads student test marks (type -1 to stop input)
 Stores them in an ArrayList<Double>
 Calculates:
 1.The average mark
 2.The highest mark
 3.The lowest mark
 4.For each student, print:
 Their mark
 Whether they are above, below, or equal to the average */
import java.lang.*;
import java.util.*;
public class StudentTestAnalyzer {
    public static void fillScores(ArrayList<Double> arr){
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();
        System.out.print("Enter a mark : ");
        double mark = scan.nextDouble();
        while(mark != -1){
            scores.add(mark);
            mark = scan.nextDouble();
        }
    }
    public static double average(ArrayList<Double> arr){
        double total =0;
        for(double a : arr){
            total += a;
        }
        return total/arr.size();
    }
    public static double highest(ArrayList<Double> arr){
        double max = -1;
        for(int i=0; i<arr.size(); i++){
            for(double b : arr){
                if(b >= max){
                    max = b;
                }
            }
        }
        return max;
    }
    public static double lowest(ArrayList<Double> arr){
        double min = 10000;
        for(int i=0; i<arr.size(); i++){
            for(double b : arr){
                if(b <= min){
                    min = b;
                }
            }
        }
        return min;
    }
    
}