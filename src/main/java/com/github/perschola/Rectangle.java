package com.github.perschola;

/**
 * Created by leon on 12/17/2019.
 */
public class Rectangle extends Polygon{

    public Rectangle(Integer width) {
        super(width);
    }

    public Rectangle() {
    }

    @Override
    public Integer getHeight() {
        return this.height;
    }

    @Override
    public Integer getWidth() {
        return this.width;
    }
}
