public class Circle implements Movable {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() { return center; }
    public double getRadius() { return radius; }

    @Override public void moveUp(double d)    { center.moveUp(d);    }
    @Override public void moveDown(double d)  { center.moveDown(d);  }
    @Override public void moveLeft(double d)  { center.moveLeft(d);  }
    @Override public void moveRight(double d) { center.moveRight(d); }

    @Override
    public String toString() {
        return "Circle[center=" + center + ", radius=" + radius + "]";
    }
}
