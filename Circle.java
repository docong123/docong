package DISM_ADF1;

public class Circle extends GeometricObject {
    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return getDiameter()*Math.PI;
    }

    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return radius*2;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }
}