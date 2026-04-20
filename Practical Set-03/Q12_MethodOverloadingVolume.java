class VolumeCalculator {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double l, double w, double h) {
        return l * w * h;
    }

    double calculateVolume(float radius) {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {
        VolumeCalculator v = new VolumeCalculator();

        System.out.println("Cube Volume: " + v.calculateVolume(3));
        System.out.println("Rectangular Cube Volume: " + v.calculateVolume(2, 3, 4));
        System.out.println("Sphere Volume: " + v.calculateVolume(2.5f));
    }
}
