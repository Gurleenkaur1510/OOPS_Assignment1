package assignment1StartingCode.src.shapes;

public class Cone extends Shape3D {
    private double height;
    private double radius;

    public Cone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() { return height; }

    public double getBaseArea() {
        return Math.PI * radius * radius;
    }

    public double getVolume() {
        return (1.0 / 3) * getBaseArea() * height;
    }

    public String toString() {
        return "Cone height=" + height + ", radius=" + radius;
    }
}

