public class Methods3 {
    public static void main(String[] args) {
        //vale for circle
        double radius = 5;

        //value for rectangle
        double length = 6;
        double width = 5;

        calculate_area(radius); //use the 1st method created below
        calculate_area2(length, width); //use the 2nd method created below
    }

    public static void calculate_area(double r) {
        double area = 3.14*r*r; //r is local variable depending on this method only
        System.out.println(area);
    }

    public static void calculate_area2(double l, double w) { //these parameters need to be use inside this method
        double area = l*w; //l and w are local variables depending on this method only
        System.out.println(area);
    }
}
