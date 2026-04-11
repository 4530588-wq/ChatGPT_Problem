/** Program that reads Golf scores of a group of athletes, computes the average score, and shows how each score
 * differs from the average score **/

import java.util.*;
public class GolfScore {
    public static void fillScores(ArrayList<Double> arr){
        Scanner scan = new Scanner(System.in);
        double score;
        System.out.print("Enter the score of athlete : ");
        score = scan.nextDouble();
            while(score >= 0){
                arr.add(score);
                score = scan.nextDouble();
            }
    }
    public static double average(ArrayList<Double> arr){
        double sum =0;
        int length = arr.size();
        for(double a : arr){
            sum += a;
        }
        double averageScore = sum/length;
        return averageScore;
    }
    public static void difference(ArrayList<Double> arr){
        double average = average(arr);
        for(double a: arr){
            System.out.println(a+" differs from the average "+average+" by "+(a - average));
        }
    }
    public static void main(String[] args){
        ArrayList<Double> scores = new ArrayList<>();
        System.out.println( "Program simply takes scores, computes average and shows how each score differs from the average score :");
        System.out.println(" ");
        System.out.println("Enter golf scores : ");
        fillScores(scores);
        difference(scores);

    }
}