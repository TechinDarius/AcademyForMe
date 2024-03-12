package Swed.it.academy.project;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Circle extends Shape {
    public Circle(int radius) {
        super(radius, radius);
    }

    @Override
    public void area() {
        super.rectangleArea();
        double circleArea = Math.PI * super.getArea();
        DecimalFormat df = new DecimalFormat("#.##");
        super.setArea(Double.parseDouble(df.format(circleArea)));
        // if using BigDecimal Object;
//        BigDecimal area = new BigDecimal(circleArea);
//        area = area.setScale(2, RoundingMode.UP);
//        super.setArea(area.doubleValue());


    }
}











