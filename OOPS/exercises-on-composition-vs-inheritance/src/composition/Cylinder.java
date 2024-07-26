package composition;

public class Cylinder {

    private Circle base;
    private double height;

    public Cylinder() {
        this.base = new Circle();
    }

    public Cylinder(Circle circle, double height) {
        this.base = new Circle(circle.getRadius(), circle.getColor());
        this.height = height;
    }

    public Cylinder(double radius) {
        this.base = new Circle(radius);
    }

    public Cylinder(double radius, String color) {
        this.base = new Circle(radius, color);
    }

    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        this.height = height;
        this.base = new Circle(radius, color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * this.height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Cylinder["+ "circle=" + super.toString() + "" + "base=" + base + ", height=" + height + '}';
    }
}