package com.github.perschola;

/**
 * Created by leon on 12/17/2019.
 */
abstract public class Polygon {
    protected Integer height =0;
    protected Integer width=0;

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
