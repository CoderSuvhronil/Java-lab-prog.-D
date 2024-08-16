class VolumeCalculator {

    double volume(double r) {
        return (4.0 / 3) * (22.0 / 7) * r * r * r;
    }

    double volume(double h, double r) {
        return (22.0 / 7) * r * r * h;
    }

    double volume(double l, double b, double h) {
        return l * b * h;
    }

    public static void main(String[] args) {
        VolumeCalculator vc = new VolumeCalculator();
        System.out.println("Volume of Sphere: " + vc.volume(5.0));
        System.out.println("Volume of Cylinder: " + vc.volume(10.0, 5.0));
        System.out.println("Volume of Cuboid: " + vc.volume(10.0, 5.0, 2.0));
    }
}
