package assignment1StartingCode.src.shapes;

public class TriangularPrism extends Shape3D {
    private double height;
    private double edge;

    public TriangularPrism(double height, double edge) {
        this.height = height;
        this.edge = edge;
    }

    public double getHeight() { return height; }

    public double getBaseArea() {
        return (Math.sqrt(3) / 4) * edge * edge;
    }

    public double getVolume() {
        return getBaseArea() * height;
    }

    public String toString() {
        return "TriangularPrism height=" + height + ", edge=" + edge;
    }
}