public class TestMovable {
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        Circle c = new Circle(new Point(0, 0), 5);

        System.out.println(p);
        System.out.println(c);

        p.moveUp(2);
        p.moveRight(4);
        System.out.println(p);

        c.moveLeft(3);
        c.moveDown(1);
        System.out.println(c);
    }
}
