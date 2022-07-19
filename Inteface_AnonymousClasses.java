package java_programs;

interface Shape {
    void draw();
}

interface Polygon {
    double area = 120;
    double perimeter = 90;
    int noOfSlides = 5;

    double getArea();

    double getPerimeter();

    boolean isPolygon();

}

class Line implements Shape {
    @Override
    public void draw() {
        // TODO Auto-generated method stub

    }

}

class Traingle implements Polygon {

}

public class Inteface_AnonymousClasses {
    public static void main(String[] args) {

    }
}
