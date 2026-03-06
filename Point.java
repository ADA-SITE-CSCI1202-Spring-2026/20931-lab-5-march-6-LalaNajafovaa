public class Point implements Movable {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    @Override public void moveUp(double d)    { y += d; }
    @Override public void moveDown(double d)  { y -= d; }
    @Override public void moveLeft(double d)  { x -= d; }
    @Override public void moveRight(double d) { x += d; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Point)) return false;
        Point other = (Point) obj;
        return Double.compare(x, other.x) == 0 && Double.compare(y, other.y) == 0;
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
