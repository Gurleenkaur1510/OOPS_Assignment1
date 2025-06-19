package assignment1StartingCode.src.shapes;

public abstract class Shape3D implements Comparable<Shape3D> {
    public abstract double getBaseArea();
    public abstract double getVolume();
    public abstract double getHeight();

    @Override
    public int compareTo(Shape3D s) {
        return Double.compare(this.getHeight(), s.getHeight());
    }
}