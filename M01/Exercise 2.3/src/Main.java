import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet: ");

        double numFeet = input.nextDouble();
        double numMeter = numFeet * 0.305;

        System.out.println(numFeet + " feet is " + numMeter + " meters.");

    }
}
