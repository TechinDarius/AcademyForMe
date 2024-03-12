package Swed.it.academy.project;

public abstract class Shape {
private double area;
private final int sideOne;
private final int sideTwo;

    public Shape(int sideOne, int sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }
    public abstract void area();
    //why public? not default?

    public void rectangleArea() {

        this.area = this.sideOne*this.sideTwo;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return this.area;
    }

    @Override
    public String toString() {
        return "Your shape's area: "
                 + area +"cm2"+
                ", sideOne=" + sideOne +"cm "+
                ", sideTwo=" + sideTwo +"cm "+
                '}';
    }


}





















