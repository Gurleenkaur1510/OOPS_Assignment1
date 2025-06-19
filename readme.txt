Assignment 1 - Sorting 3D Shapes
--------------------------------

How to Compile:
---------------
javac -d bin src/assignment1StartingCode/src/shapes/*.java src/assignment1StartingCode/src/appDomain/*.java

How to Run:
-----------
java -cp bin assignment1StartingCode.src.shapes.Main -f"res/shapes1.txt" -tv -sb

Command Line Options:
---------------------
-f : file path (e.g., res/shapes1.txt)
-t : comparison type
     h = height
     v = volume
     a = base area
-s : sort algorithm
     b = bubble
     s = selection
     i = insertion
     m = merge
     q = quick
     z = heap (custom sort)

Example:
--------
java -cp bin assignment1StartingCode.src.shapes.Main -f"res/shapes3.txt" -ta -sq

How to Run JAR:
---------------
java -jar Sort.jar -f"res/shapes1.txt" -tv -sb
