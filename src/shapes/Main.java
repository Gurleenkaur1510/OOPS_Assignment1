package assignment1StartingCode.src.shapes;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = null;
        String compareType = "h"; // default height
        String sortType = "b";    // default bubble

        // Parse command-line arguments
        for (String arg : args) {
            if (arg.toLowerCase().startsWith("-f")) {
                fileName = arg.substring(2).replace("\"", "");
            } else if (arg.toLowerCase().startsWith("-t")) {
                compareType = arg.substring(2).toLowerCase();
            } else if (arg.toLowerCase().startsWith("-s")) {
                sortType = arg.substring(2).toLowerCase();
            }
        }

        if (fileName == null) {
            System.out.println("Error: Input file not provided. Use -f<filename>");
            return;
        }

        // Read shape data
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        int count = Integer.parseInt(br.readLine());
        Shape3D[] shapes = new Shape3D[count];
        for (int i = 0; i < count; i++) {
            shapes[i] = ShapeFactory.createShape(br.readLine().split(" "));
        }
        br.close();

        // Get appropriate comparator (null if using Comparable)
        Comparator<Shape3D> comparator = switch (compareType) {
            case "v" -> new VolumeComparator();
            case "a" -> new BaseAreaComparator();
            default -> null;
        };

        // Sort the shapes
        long start = System.nanoTime();
        if (comparator == null) {
            Arrays.sort(shapes); // uses Comparable (height)
        } else {
            switch (sortType) {
                case "b" -> SortUtils.bubbleSort(shapes, comparator);
                case "s" -> SortUtils.selectionSort(shapes, comparator);
                case "i" -> SortUtils.insertionSort(shapes, comparator);
                case "m" -> SortUtils.mergeSort(shapes, comparator);
                case "q" -> SortUtils.quickSort(shapes, comparator);
                case "z" -> SortUtils.heapSort(shapes, comparator); // custom
                default -> System.out.println("Unknown sort type. Using bubble sort.");
            }
        }
        long end = System.nanoTime();

        // Output results in assignment format
        String sortName = switch (sortType) {
            case "b" -> "Bubble Sort";
            case "s" -> "Selection Sort";
            case "i" -> "Insertion Sort";
            case "m" -> "Merge Sort";
            case "q" -> "Quick Sort";
            case "z" -> "Heap Sort";
            default -> "Unknown Sort";
        };

        String compareLabel = switch (compareType) {
            case "v" -> "Volume";
            case "a" -> "Base Area";
            default -> "Height";
        };

        // First element
        System.out.printf("First element is:     %-25s %s: %.6f\n",
                shapes[0].getClass().getName().replace("assignment1StartingCode.src.", ""),
                compareLabel,
                compareType.equals("v") ? shapes[0].getVolume() :
                        compareType.equals("a") ? shapes[0].getBaseArea() : shapes[0].getHeight()
        );

        // Every 1000th element
        for (int i = 1000; i < shapes.length; i += 1000) {
            System.out.printf("%d-th element:       %-25s %s: %.6f\n",
                    i,
                    shapes[i].getClass().getName().replace("assignment1StartingCode.src.", ""),
                    compareLabel,
                    compareType.equals("v") ? shapes[i].getVolume() :
                            compareType.equals("a") ? shapes[i].getBaseArea() : shapes[i].getHeight()
            );
        }

        // Last element
        System.out.printf("Last element is:      %-25s %s: %.6f\n",
                shapes[shapes.length - 1].getClass().getName().replace("assignment1StartingCode.src.", ""),
                compareLabel,
                compareType.equals("v") ? shapes[shapes.length - 1].getVolume() :
                        compareType.equals("a") ? shapes[shapes.length - 1].getBaseArea() : shapes[shapes.length - 1].getHeight()
        );

        // Sort timing
        System.out.printf("%s run time was: %.0f milliseconds\n", sortName, (end - start) / 1_000_000.0);
    }
}