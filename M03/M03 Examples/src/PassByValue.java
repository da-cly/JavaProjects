public class PassByValue {
        public static void main(String[] args) {
            int x = 1;
            System.out.println("Before the call, x is " + x);
            increment(x);
            System.out.println("After the call, x is " + x);
        }

        public static void increment(int n) { //void method does not return the value to previous method
            n++;
            System.out.println("n inside the method is " + n);
        }
    }
}
