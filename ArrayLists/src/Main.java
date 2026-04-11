import java.util.*;
public class Main {
    public static void main(String[] args){
        ArrayList<String> groceryList = new ArrayList<>(10);
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        String next = null;
        String answer;
        while(!done){
            System.out.print("What item you are buying : ");
            next = scan.nextLine();
            groceryList.add(next);
            System.out.println(" ");
            System.out.print("Are you done yet : ");
            answer = scan.nextLine();
            if(answer.equalsIgnoreCase("yes")){
                done = true;
            }
        }
        System.out.println("Items bought :");
        for(String items : groceryList){
            System.out.println(items);
        }
        scan.close();
    }
}