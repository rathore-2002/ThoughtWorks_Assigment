package inheritance;

import inheritance.Circle;

public class Cylinder extends Circle {

    private Circle base;
    private double height;

    public Cylinder() {
        this.base = new Circle();
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
        this.base = new Circle();
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
        this.base = new Circle();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.getArea() * this.height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "inheritance.Cylinder["+ "circle=" + super.toString() + "" + "base=" + base + ", height=" + height + '}';
    }
}