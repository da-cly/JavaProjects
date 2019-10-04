import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%5s%11s%19s%9s\n", "Feet", "Meters", "Meters", "Feet");
        System.out.println("---------------------------------------------");

        double foot = 1;
        double meter = 20;
        for (int i = 1; i <= 10; foot++, meter += 5, i++) {
            System.out.printf("%5.1f%10.3f%20.1f%10.3f\n", foot, footToMeter(foot), meter, meterToFoot(meter));
        }
    }

    /** Converts from feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Converts from meters to feet */
    public static double meterToFoot(double meter) {
        return (1/0.305) * meter;
    }
}
