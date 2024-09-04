import java.util.Scanner;
 class options {
     public void choose() {
         System.out.println("1. ROCK");
         System.out.println("2. PAPER");
         System.out.println("3. SCISSOR");
         System.out.println("4. EXIT");
         System.out.println("Player 1 : ");
         Scanner sc = new Scanner(System.in);
         int opt1 = sc.nextInt();
         System.out.println("Player 2 : ");
         int opt2 = sc.nextInt();

         if (opt1 == 1 && opt2 == 1) {
             System.out.println("Try Again!");
             System.out.println("You both Choose same ");
         }
         else if (opt1 == 1 && opt2 == 2) {
             System.out.println("Player 2 Win :)");
             System.out.println("Paper will cover the rock ");
         }
         else if (opt1 == 1 && opt2 == 3) {
             System.out.println("Player 1 Win :)");
             System.out.println("Rock will break the scissor ");
         }
         else if (opt1 == 2 && opt2 == 1) {
             System.out.println("Player 1 Win :)");
             System.out.println("Paper can cover the rock ");
         }
         else if (opt1 == 2 && opt2 == 2) {
             System.out.println("Try Again!");
             System.out.println("You both Choose same ");
         }
         else if (opt1 == 2 && opt2 == 3) {
             System.out.println("Player 2 Win :)");
             System.out.println("Scissor will cut the paper ");
         }
         else if (opt1 == 3 && opt2 == 1) {
             System.out.println("Player 2 Win :)");
             System.out.println("Rock will break the scissor ");
         }
         else if (opt1 == 3 && opt2 == 2) {
             System.out.println("Player 1 Win :)");
             System.out.println("Scissor will cut the paper ");
         }
         else if (opt1 == 3 && opt2 == 3) {
             System.out.println("Try Again!");
             System.out.println("You both Choose same ");
         }
     }
 }
public class Main {
    public static void main(String[] args) {

        options players = new options();
        players.choose();
    }
}