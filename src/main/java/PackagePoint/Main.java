package PackagePoint;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point();
        Point point2 = new Point();
        point1.x = 10;
        point1.y = 8;
        point2.x = 8;
        point2.y = 6;

        System.out.println (Point.distance(point1,point2));

    }
}