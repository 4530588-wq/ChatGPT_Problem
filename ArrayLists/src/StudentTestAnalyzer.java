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
        System.out.print("Enter a mark : ");
        double mark = scan.nextDouble();
        while(mark >= 0){
            arr.add(mark);
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
        double max = arr.get(0);
            for(double b : arr){
                if(b > max){
                    max = b;
                }
            }
        return max;
    }
    public static double lowest(ArrayList<Double> arr){
        double min = arr.get(0);
            for(double b : arr){
                if(b < min){
                    min = b;
                }
        }
        return min;
    }
    public static void main(String[] args){
        ArrayList<Double> scores = new ArrayList<>();
        fillScores(scores);
        System.out.println("These are the scores \n");
        for(double a : scores){
            System.out.print(a+" ");
        }
        System.out.println(" ");
        double averageMark = average(scores);
        System.out.println("The average mark is "+averageMark+ " ,the highest mark obtained is "+highest(scores)+" ,the lowest is "+lowest(scores));
        for(double k : scores){
            if(k > averageMark){
                System.out.println("Student with mark "+k+" scored above the average mark");
            }
            else if(k < averageMark){
                System.out.println("Student with mark "+k+" scored below the average mark");
            }
            else{
                System.out.println("Student with mark "+k+" scored equal the average mark");
            }
        }
    }
}