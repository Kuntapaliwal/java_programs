package java_programs;

abstract class Shape {
    String shapeName;
    double area;
    double perimeter;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    abstract public double calculateArea();

    abstract public double calculatePerimeter();

    abstract public String draw();

}

class Rectangle extends Shape {
    double length, breadth;

    public Rectangle(String shapeName, double length, double breadth) {
        super(shapeName);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        return length * breadth;
    }

    @Override
    public double calculatePerimeter() {
        // TODO Auto-generated method stub
        return 2 * (length + breadth);
    }

    @Override
    public String draw() {
        // TODO Auto-generated method stub
        return "rectangle is drawn";
    }

}

class Square extends Shape {

    public Square(String shapeName) {
        super(shapeName);
    }

    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String draw() {
        // TODO Auto-generated method stub
        return " ";
    }

}

class Circle extends Shape {

    public Circle(String shapeName, double area, double perimeter) {
        super(shapeName);
    }

    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String draw() {
        // TODO Auto-generated method stub
        return " ";
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Shape shape = new Rectangle("Rectangle", 5, 4);
        System.out.println(shape.draw());
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());

    }
}
