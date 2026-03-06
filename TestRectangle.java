public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle(5, 3);
        Rectangle r3 = new Rectangle(4, 3);

        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
        System.out.println(r1 == r2);
    }
}
