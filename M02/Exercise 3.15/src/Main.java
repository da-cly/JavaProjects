import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Randomize the lottery
        int lottery = (int)(Math.random() * 1000);

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick in three digits: ");
        int guessNum = input.nextInt();

        // Get lottery digits
        int l1 = lottery / 100;
        int l2 = (lottery % 100) / 10; // l2 = (lottery / 10) % 10
        int l3 = lottery % 10;

        // Get guess number digits
        int g1 = guessNum / 100;
        int g2 = (guessNum % 100) / 10;
        int g3 = guessNum % 10;

        System.out.println("The lottery is " + lottery);

        // Check the guess number
        if (guessNum == lottery)
            System.out.println("Congratulations! You won $10,000 for the EXACT match.");
        else if (g1 == l1 && g3 == l2 && g2 == l3 || g2 == l1 && g1 == l2 && g3 == l3 || g2 == l1 && g3 == l2 && g1 == l3 ||
                g3 == l1 && g1 == l2 && g2 == l3 || g3 == l1 && g2 == l2 && g1 == l3)
            System.out.println("Congratulations! You won $3,000 for matching ALL digits.");
        else if (g1 == l1 || g1 == l2 || g1 == l3 || g2 == l1 || g2 == l2 || g2 == l3 || g3 == l1 || g3 == l2 || g3 == l3)
            System.out.println("Congratulations! You won $1,000 for matching ONE digit.");
        else
            System.out.println("Sorry, no match found. Better luck next time!");

    }
}
