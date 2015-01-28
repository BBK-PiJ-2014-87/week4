
public class Point {
    int x;
    int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void increment(Point point, int n) {
        n = n + 1;
        point.x = point.x + 1;
        System.out.println("At the end of this method...");
        System.out.println("The integer n is" + n);
        System.out.println("The point is x: " + point.x + "y: " + point.y);
    }

}

