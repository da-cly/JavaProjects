import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value for a feet:");
        double number = input.nextDouble();

        double result = number*0.305;
        System.out.println(number + " feet is " + result + " meters");

    }
}


