package LessonsFourAndFive;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int quadrant(Point inputPoint){
        int currentX = inputPoint.x;
        int currentY = inputPoint.y;

        if (currentX > 0 & currentY > 0) {

            return 1;

        } else if (currentX < 0 & currentY > 0) {

            return 2;

        } else if (currentX < 0 & currentY < 0) {

            return 3;

        } else if (currentX > 0 & currentY < 0) {

            return 4;

        } else {
            return 0;
        }
    }

    public Point flip (Point inputPoint) {

        return new Point(inputPoint.getX()*(-1),inputPoint.getY()*(-1));

    }





}
