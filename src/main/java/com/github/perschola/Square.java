package com.github.perschola;

/**
 * Created by leon on 12/17/2019.
 */
public class Square extends Rectangle implements Shape {
    public Square(Integer width) {
        super(width);
    }

    public Square() {
    }
    @Override
    public String getDimensions() {
        String expectedDimensions = new StringBuilder()
                .append("My width is ")
                .append(width)
                .append(". My height is")
                .append(width)
                .toString();

      return expectedDimensions;
    }
}
