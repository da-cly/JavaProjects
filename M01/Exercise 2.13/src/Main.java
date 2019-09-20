import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter monthly saving amount: ");

        double monthlySavingAmt = input.nextDouble();
        double monthlyInterestRate = 0.05 / 12;
        double acctValue = monthlySavingAmt;

        // First month value
        acctValue = acctValue * (1 + monthlyInterestRate);
        System.out.println("After the first month, the account value is " + acctValue);

        // Second month value
        acctValue = (acctValue + monthlySavingAmt) * (1 + monthlyInterestRate);
        System.out.println("After the second month, the account value is " + acctValue);

        // Third month value
        acctValue = (acctValue + monthlySavingAmt) * (1 + monthlyInterestRate);
        System.out.println("After the third month, the account value is " + acctValue);

        // Fourth month value
        acctValue = (acctValue + monthlySavingAmt) * (1 + monthlyInterestRate);

        // Fifth month value
        acctValue = (acctValue + monthlySavingAmt) * (1 + monthlyInterestRate);

        // Sixth month value
        acctValue = (acctValue + monthlySavingAmt) * (1 + monthlyInterestRate);

        System.out.println("After the sixth month, the account value is " + acctValue);

    }

}
