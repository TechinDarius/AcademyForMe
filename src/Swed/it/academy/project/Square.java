package Swed.it.academy.project;

public class Square extends Shape{
    public Square(int side) {
        super(side, side);

    }

    @Override
    public void area() {
        super.rectangleArea();
    }
}
