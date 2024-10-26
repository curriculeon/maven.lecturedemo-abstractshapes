package com.github.perschola;

/**
 * Created by leon on 12/17/2019.
 */
public class Circle extends Polygon implements Shape {
    public Circle() {
        super();
    }
    @Override
    public Integer getHeight() {
        return height;
    }



    @Override
    public Integer getWidth() {
        return width;
    }

    @Override
    public String getDimensions() {
        String expectedDimensions = new StringBuilder()
                .append("My dimensions are ")
                .append("(3.14 * ")
                .append(width)
                .append(" squared")
                .toString();
        return expectedDimensions;
    }
}
