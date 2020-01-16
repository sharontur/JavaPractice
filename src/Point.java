import com.sun.org.apache.xerces.internal.xinclude.XPointerElementHandler;

public class Point {
    private int x, y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        x = p.x;
        y = p.y;
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

    public boolean equals(Point p) {
        if (x == p.x && y == p.y)
            return true;
        return false;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public double distance(Point p) {
        int x1 = p.getX();
        int y1 = p.getY();
        int x2 = this.x;
        int y2 = this.y;
        double d = Math.sqrt(Math.pow(x1-x2, 2)+ Math.pow(y1-y2, 2));

        return d;
    }
    public double distanceFromBase() {
        Point base = new Point(0, 0);
        return distance(base);
    }

}
