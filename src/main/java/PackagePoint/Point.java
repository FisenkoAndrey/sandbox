package PackagePoint;

public class Point {

    public double x;
    public double y;


    public static double distance(Point p1, Point p2) {
        double d = Math.sqrt((p1.x - p2.y) * (p1.x - p2.y) + (p1.x - p2.y) * (p1.x * p2.y));
        return d;
    }
}



