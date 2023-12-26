package Week_11;

/*
    Question: A point in 3D space can be denoted by its x, y, and z coordinates. The distance between two points can be found using the Euclidean distance: simply subtract each respective coordinate of two points, take their squares, add them, then take the square root. In mathematical terms, for Point P(x, y, z) and Point Q(a, b, c) the distance d between them is:
𝑑 = (𝑥−𝑎)2+(𝑦−𝑏)2 + (𝑧−𝑐)2
Create a list of 50 random points in 3D space, where x, y, and z coordinates are randomly set between 0 and 100. Then ask the user to enter the x, y, z coordinates for a point R. Find the most distant point to R in the randomly generated list and print point R, the most distant point, and the distance between them.

 */

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point[] points = new Point[50];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point();
        }
        Point r = new Point();
        System.out.print("Enter x, y, z coordinates for point R: ");
        r.setX(scanner.nextDouble());
        r.setY(scanner.nextDouble());
        r.setZ(scanner.nextDouble());
        Point mostDistant = points[0];
        double maxDistance = r.distance(mostDistant);
        for (int i = 1; i < points.length; i++) {
            double distance = r.distance(points[i]);
            if (distance > maxDistance) {
                maxDistance = distance;
                mostDistant = points[i];
            }
        }
        System.out.println("Point R: " + r);
        System.out.println("Most distant point: " + mostDistant);
        System.out.println("Distance: " + maxDistance);
    }
}

class Point {
    double x, y, z;

    public Point() {
        x = Math.random() * 100;
        y = Math.random() * 100;
        z = Math.random() * 100;
    }

    public double distance(Point q) {
        return Math.sqrt(Math.pow(x - q.x, 2) + Math.pow(y - q.y, 2) + Math.pow(z - q.z, 2));
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
