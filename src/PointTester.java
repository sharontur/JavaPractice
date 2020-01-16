public class PointTester {
    public static void main(String[] args) {
        Point p1 = new Point((int)(Math.random()*10),
                (int)(Math.random()*10));
        // ...
        Point p2 = new Point(p1);
        Point p3 = new Point(p1.getX(), p1.getY());
        System.out.println(p1 == p2); // 1 - false
        System.out.println(p1.equals(p2)); // 2 - true
        //p1 = p2;
        System.out.println(p1 == p2); // 3 - true
        //p1.setX(20);
        System.out.println("X:" + p2.getX()); // 4  x:20
        //p1 = null;
        //        System.out.println("X:" + p2.getX()); // 5  null
        //System.out.println("X:" + p1.getX()); // 6  null

        //p1.setX(10);
        //p1.setY(10);
        p2.setX(2);
        p2.setY(2);
       System.out.println(p1.distance(p2));
        System.out.println(p1);
        System.out.println(p1.distanceFromBase());


    }
}