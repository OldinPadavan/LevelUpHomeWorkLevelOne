package LessonsFourAndFive;

public class PointApp {
    public static void main(String[] args) {
        Point point = new Point(5,10);

        Point nextPoint = new Point(3, -1);

        System.out.println(nextPoint.quadrant(nextPoint));
        System.out.println(nextPoint.getX() + " " + nextPoint.getY());
        Point point1 = nextPoint.flip(nextPoint);
        System.out.println(point1.quadrant(point1));

    }
}
