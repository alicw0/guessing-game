import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int x = rand.nextInt(100);
        int guess;
        System.out.println("Enter your first guess:");
        guess = scan.nextInt();
        int count = 1; 

        while (guess != x) {
            if (guess < x) {
                System.out.println("too low");
            } else if (guess > x) {
                System.out.println("too high");
            }
          
            System.out.println("Enter your next guess:");
            guess = scan.nextInt();
            count++; 
        }

     
        if (count <= 7) {
            System.out.println("You have amazing guessing skills");
        } else if (count <= 10) {
            System.out.println("Good job");
        } else {
            System.out.println("Try the divide and conquer strategy next time!");
        }

    }
}