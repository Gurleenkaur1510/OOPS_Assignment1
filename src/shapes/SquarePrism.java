package assignment1StartingCode.src.shapes;

public class SquarePrism extends Shape3D {
    private double height;
    private double edge;

    public SquarePrism(double height, double edge) {
        this.height = height;
        this.edge = edge;
    }

    public double getHeight() { return height; }

    public double getBaseArea() {
        return edge * edge;
    }

    public double getVolume() {
        return getBaseArea() * height;
    }

    public String toString() {
        return "SquarePrism height=" + height + ", edge=" + edge;
    }
}