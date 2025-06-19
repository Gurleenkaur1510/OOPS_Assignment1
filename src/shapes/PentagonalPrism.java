package assignment1StartingCode.src.shapes;

public class PentagonalPrism extends Shape3D {
    private double height;
    private double edge;

    public PentagonalPrism(double height, double edge) {
        this.height = height;
        this.edge = edge;
    }

    public double getHeight() { return height; }

    public double getBaseArea() {
        return (5 * edge * edge) / (4 * Math.tan(Math.toRadians(54)));
    }

    public double getVolume() {
        return getBaseArea() * height;
    }

    public String toString() {
        return "PentagonalPrism height=" + height + ", edge=" + edge;
    }
}