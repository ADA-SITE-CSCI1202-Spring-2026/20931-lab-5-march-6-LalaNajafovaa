public class TestSquare {
    public static void main(String[] args) {
        Square s1 = new Square(4);
        Square s2 = new Square(4);
        Square s3 = new Square(7);
        Rectangle r = new Rectangle(4, 4);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(r));

        Rectangle ref = s1;
        System.out.println(ref);
        System.out.println(ref instanceof Square);
        System.out.println(ref instanceof Rectangle);
    }
}
