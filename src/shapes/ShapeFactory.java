package assignment1StartingCode.src.shapes;

public class ShapeFactory {
    public static Shape3D createShape(String[] tokens) {
        String type = tokens[0].toLowerCase();
        double h = Double.parseDouble(tokens[1]);
        double v = Double.parseDouble(tokens[2]);

        return switch (type) {
            case "cylinder" -> new Cylinder(h, v);
            case "cone" -> new Cone(h, v);
            case "pyramid" -> new Pyramid(h, v);
            case "squareprism" -> new SquarePrism(h, v);
            case "triangularprism" -> new TriangularPrism(h, v);
            case "pentagonalprism" -> new PentagonalPrism(h, v);
            case "octagonalprism" -> new OctagonalPrism(h, v);
            default -> throw new IllegalArgumentException("Unknown shape type: " + type);
        };
    }
}