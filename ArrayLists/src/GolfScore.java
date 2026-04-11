/** Program that reads Golf scores of a group of athletes, computes the average score, and shows how each score
 * differs from the average score **/
import java.util.*;
public class GolfScore {
    public static void fillScores(ArrayList<Double> arr){
        Scanner scan = new Scanner(System.in);
        double score = 0;
        for(int i = 1; i<= arr.size(); i++){
        System.out.print("Enter the score of athlete "+i+" : ");
        score = scan.nextDouble();
            while(score >= 0){
                arr.add(score);
                score = scan.nextDouble();
            }
        }
    }
    public static double average(ArrayList<Double> arr){
        double sum =0;
        int length = arr.size();
        for(double a : arr){
            sum += a;
        }
        return double averageScore = sum/length;
    }
}