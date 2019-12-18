package com.github.perschola.square;

import com.github.perschola.Polygon;
import com.github.perschola.Square;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/17/2019.
 */
public class NonNullaryConstructor {
    // given
    private void test(Integer expectedWidth) {
        // when
        Square square = new Square(expectedWidth);
        Polygon squareAsPolygon = (Polygon) (Object) square;
        Integer actualWidth = squareAsPolygon.getWidth();
        Integer actualHeight = squareAsPolygon.getHeight();

        // then
        Assert.assertEquals(actualWidth, actualHeight);
        Assert.assertEquals(expectedWidth, actualWidth);
    }

    @Test
    public void test0() {
        test(1);
    }

    @Test
    public void test1() {
        test(2);
    }

    @Test
    public void test2() {
        test(9999);
    }
}
