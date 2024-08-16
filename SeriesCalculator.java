class SeriesCalculator {

    double series(double n) {
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum += 1 / i;
        }
        return sum;
    }

    double series(double a, double n) {
        double sum = 0;
        double term = 1;
        for (double i = 1; i <= n; i++) {
            sum += term / Math.pow(a, (3 * i - 1));
            term += 3;
        }
        return sum;
    }

    public static void main(String[] args) {
        SeriesCalculator sc = new SeriesCalculator();
        System.out.println("Sum of Series (1 argument): " + sc.series(5.0));
        System.out.println("Sum of Series (2 arguments): " + sc.series(2.0, 5.0));
    }
}
