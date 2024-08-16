class AreaCalculator {

    double area(double base, double ht) {
        return base * ht;
    }

    double area(double d1, double d2, boolean isRhombus) {
        return (1.0 / 2) * d1 * d2;
    }

    double area(double a, double b, double h) {
        return (1.0 / 2) * (a + b) * h;
    }

    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();
        System.out.println("Area of Parallelogram: " + ac.area(10.0, 5.0));
        System.out.println("Area of Rhombus: " + ac.area(8.0, 6.0, true));
        System.out.println("Area of Trapezium: " + ac.area(10.0, 5.0, 7.0));
    }
}
