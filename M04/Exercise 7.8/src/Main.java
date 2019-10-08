import java.util.Scanner;
import java.util.Arrays;
//Under the resources module the Java.ppt file contains slides fro today
//Download, unzip and open up 07slide
//slide 35 may help you
//int[] intlist = new int[10];

public class Main {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        double[] doubleList = new double[10];
        System.out.println("Enter 10 double values: ");

        int i = 0;
        while (i < doubleList.length) {
            doubleList[i] = input.nextDouble();
            i++;
        }
        System.out.println("The average double value is: " + average(doubleList));
    }

    public static int average(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum/array.length;
    }
    public static double average(double[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum/array.length;
    }
}
