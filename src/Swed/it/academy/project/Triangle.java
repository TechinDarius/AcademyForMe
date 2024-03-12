package Swed.it.academy.project;

public class Triangle extends Shape{
    public Triangle(int sideOne, int sideTwo) {
        super(sideOne, sideTwo);
    }

    @Override
    public void area() {
        super.rectangleArea();
        double triangleArea= (double) super.getArea() /2;
        super.setArea(triangleArea);
    }
}
