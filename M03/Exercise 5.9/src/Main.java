import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of students: "); // Prompt the user to enter number of students
        int numStudent = input.nextInt();

        System.out.print("Enter the student name: "); // highStudent has the highest score
        String highStudent = input.next();

        System.out.print("Enter the student score: ");
        double highScore = input.nextDouble();

        System.out.print("Enter the student name: "); // lowStudent has the second highest score
        String lowStudent = input.next();

        System.out.print("Enter the student score: ");
        double lowScore = input.nextDouble();

        if (highScore < lowScore) {
            // Swap
            String tempStudent = highStudent;
            double tempScore = highScore;

            highStudent = lowStudent;
            highScore = lowScore;

            lowStudent = tempStudent;
            lowScore = tempScore;
        }

        for (int i = 0; i < numStudent - 2; i++) { //loop number of students
            System.out.print("Enter a student name: ");
            String newStudent = input.next();

            System.out.print("Enter a student score: ");
            double newScore = input.nextDouble();

            if (newScore > highScore) {
                lowStudent = highStudent; // highStudent now is the second highest
                lowScore = highScore;

                highStudent = newStudent; // new student becomes the highest
                highScore = newScore;
            }
            else if (newScore > lowScore) {
                lowStudent = newStudent; // new student becomes the second highest
                lowScore = newScore;
            }
        }

        System.out.println("Top two students are: " + highStudent + " and " + lowStudent);
        System.out.println(highStudent + "'s score is " + highScore);
        System.out.println(lowStudent + "'s score is " + lowScore);
    }
}
