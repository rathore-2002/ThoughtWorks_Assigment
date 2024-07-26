package inheritance;

import composition.Circle;
import composition.Cylinder;

public class TestCylinder {
    public static void main(String[] args) {

        // Test constructor Cylinder(double radius, double height, String color)
        Cylinder cylinder = new Cylinder(2.5, 5, "red");
        System.out.println("Get the cylinder radius: "+ cylinder.getBase().getRadius());
        System.out.println("Get the cylinder color: "+cylinder.getBase().getColor());
        System.out.println("Get the cylinder area: "+cylinder.getBase().getArea());
        System.out.println("Get the cylinder height: "+cylinder.getHeight());
        System.out.println("Get the cylinder volume: "+cylinder.getVolume());


        // Test constructor Cylinder(Circle circle, double height)
        Circle circle = new Circle(2.5, "red");
        Cylinder cylinder1 = new Cylinder(circle, 5);
        System.out.println("Get the cylinder radius: "+cylinder1.getBase().getRadius());
        System.out.println("Get the cylinder color: "+cylinder1.getBase().getColor());
        System.out.println("Get the cylinder area: "+cylinder1.getBase().getArea());
        System.out.println("Get the cylinder height: "+cylinder1.getHeight());
        System.out.println("Get the cylinder volume: "+cylinder1.getVolume());
    }
}
