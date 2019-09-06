

import java.util.Scanner; // Scanner is in the java.util package (explicit)
//import java.util.*; // * is a wildcard (implicit)

public class Main {

    public static void main(String[] args) { //psvm
        double radius; // Declare radius
        double area; // Declare area
        final double PI = 3.14159; // Declare constant (variable that does not change)

        // Assign a radius
        radius = 20; // New value is radius

        // Compute area
        area = radius * radius * PI;

        // Display results
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);


        // Create a Scanner object
        Scanner input = new Scanner(System.in); // input means taking in data

        // Prompt the user to enter three numbers
        System.out.print("Enter one numbers: ");
//        double number = input.nextDouble(); //next is a method blending to a class Double
//        System.out.println(number);

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // Compute average
        double average = (number1 + number2 + number3) / 3;

        // Display result
        System.out.println("The average of " + number1 + " " + number2
                + " " + number3 + " is " + average);



    }

}

