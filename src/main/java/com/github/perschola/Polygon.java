package com.github.perschola;

/**
 * Created by leon on 12/17/2019.
 */
abstract public class Polygon {
    private Integer height;
    private Integer width;

    public Polygon(Integer width) {
        this.width = width;
    }

    public Polygon() {
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    abstract public Integer getHeight();
    abstract public Integer getWidth();
}
