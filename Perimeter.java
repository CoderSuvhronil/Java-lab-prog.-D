class Perimeter {

    double calculatePerimeter(double s) {
        return 4 * s;
    }

    double calculatePerimeter(double l, double b) {
        return 2 * (l + b);
    }

    double calculatePerimeter(double r, boolean isCircle) {
        return 2 * (22.0 / 7) * r;
    }

    public static void main(String[] args) {
        Perimeter p = new Perimeter();
        System.out.println("Perimeter of Square: " + p.calculatePerimeter(5.0));
        System.out.println("Perimeter of Rectangle: " + p.calculatePerimeter(10.0, 5.0));
        System.out.println("Perimeter of Circle: " + p.calculatePerimeter(7.0, true));
    }
}
