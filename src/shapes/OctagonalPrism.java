package assignment1StartingCode.src.shapes;

public class OctagonalPrism extends Shape3D {
    private double height;
    private double edge;

    public OctagonalPrism(double height, double edge) {
        this.height = height;
        this.edge = edge;
    }

    public double getHeight() { return height; }

    public double getBaseArea() {
        return 2 * (1 + Math.sqrt(2)) * edge * edge;
    }

    public double getVolume() {
        return getBaseArea() * height;
    }

    public String toString() {
        return "OctagonalPrism height=" + height + ", edge=" + edge;
    }
}