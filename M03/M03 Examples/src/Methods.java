public class Methods {
    public static void main(String[] args) {           //We can have many methods within a main class
           int x =0;                                    //Public means for everyone’s use, private is only use privately
            int first = 4;
            int second = 5;

            float y = 0;
            float firstFloat = 6;
            float secondFloat = 7;

            x = add(first,second); //this is a call statement     //Static means there is no return, nothing to store
            System.out.println(x);
            y = add(firstFloat,secondFloat);                            //String[] args are for debugging purposes
            System.out.println(y);                               //This mean take other methods and executed with the main method

    }

    public static int add(int num1, int num2){ //int num1, num2 are parameters
                                                    // whichever variables put in add() would apply under this method
        int sum = num1 + num2; //
        int sum2 = num1 + num2; //if add sum2, sum is the only can be return. If wanted, must need add2();
        return sum;

    }

    public static float add(float num1, float num2) { //make add() to use any type of variables like float, etc
        float sum = num1 + num2;
        return sum;
    }//
}
//Methods has object vs function needs no object
//Method overloading: using the same method to perform the same actions. One way to do is change the data type from int to float in add method shown above
