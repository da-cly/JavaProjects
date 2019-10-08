public class ArraysMethod {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4}; //creat two arrays
        int[] list2 = {5, 6, 7, 8};

        printArray(list1);
        printArray(list2);

    }

    public static void printArray(int[] array) {
        for (int item : array) {

            System.out.println(item);

        }
    }
}
