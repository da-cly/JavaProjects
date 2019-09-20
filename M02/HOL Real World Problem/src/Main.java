import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputPatient = new Scanner(System.in);
        String firstName, lastName, addressLine1, city, state, zip, zipExt, amtOwned, amtPay, datePay;
        zipExt = "1234";

        System.out.println("Please enter your last name: ");
        firstName = inputPatient.nextLine();

        System.out.println("Please enter your last name: ");
        lastName = inputPatient.nextLine();

        System.out.println("Please enter your address: ");
        addressLine1 = inputPatient.nextLine();

        System.out.println("Please enter your city: ");
        city = inputPatient.nextLine();

        System.out.println("Please enter your state: ");
        state = inputPatient.nextLine();

        System.out.println("Please enter your zip code: ");
        zip = inputPatient.nextLine();

        System.out.println("Please enter your owned amount: ");
        amtOwned = inputPatient.nextLine();

        System.out.println("Please enter your payment amount: ");
        amtPay = inputPatient.nextLine();

        System.out.println("Please enter your payment date: ");
        datePay = inputPatient.nextLine();

        System.out.println("\t\t\t\t\t\t\t\t\t\t XYZ Community Hospital");
        System.out.println("====================================================================================================================");
        System.out.println("Name \t\t\t\t\t\t\t\t Address \t\t\t\t\t\t\t\t Payment Information");
        System.out.println("Last  First  Address Line 1 \t\t City\t\t State\t Zip \t\t\t Amount Owed\t Payment Amt.\t Payment Date");
        System.out.println("Doe\t John\t 1234 Test Drive\t\t AnyCity\t IN\t 12345-1234 \t\t $2000.00\t\t $20.00 \t\t 10/02/2017");
        System.out.println(firstName + "\t" + lastName + "\t" + addressLine1 + "\t\t" + city + "\t" + state + "\t" + zip + "-" + zipExt + "\t\t\t\t$" + amtOwned + "\t\t$" + amtPay + "\t\t" + datePay);

    }
}
