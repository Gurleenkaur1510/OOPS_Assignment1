package assignment1StartingCode.src.shapes;

import java.util.Comparator;

public class VolumeComparator implements Comparator<Shape3D> {
    @Override
    public int compare(Shape3D o1, Shape3D o2) {
        return Double.compare(o2.getVolume(), o1.getVolume());
    }
}