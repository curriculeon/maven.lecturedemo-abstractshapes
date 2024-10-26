package com.github.perschola;

/**
 * Created by leon on 12/17/2019.
 */
abstract public class Polygon {
    protected Integer height =333;
    protected Integer width=222;

    public Polygon(Integer width) {
        this.width =width;
        this.height=width;
    }

    public Polygon() {
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight(){
        return this.height;
    };

    public Integer getWidth(){
        return this.width;
    };

}
