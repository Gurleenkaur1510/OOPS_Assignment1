package assignment1StartingCode.src.shapes;

public class Cylinder extends Shape3D {
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() { return height; }

    public double getBaseArea() {
        return Math.PI * radius * radius;
    }

    public double getVolume() {
        return getBaseArea() * height;
    }

    public String toString() {
        return "Cylinder height=" + height + ", radius=" + radius;
    }
}

