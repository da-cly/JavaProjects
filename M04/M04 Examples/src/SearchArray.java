import java.util.Arrays;


public class SearchArray {
    public static void main(String[] args) {
        int[] list1 = {4, 2, 1, 8}; //creat two arrays
        Arrays.sort(list1); //sort smallest to largest


        int result = linearSearch(list1, 10); //using linear
        System.out.println(Arrays.binarySearch(list1, 4)); //if using binary, array must be in order to be good
        System.out.println(Arrays.toString(list1));
    }

    public static int linearSearch(int[] array, int key){
        for (int i = 0; i < array.length; i++) { //creat if statement to return -1 for no results
            if (key == array[i]) {  // equals the value of i values
                return i;
            }
        }
                return -1;
        }
    }
