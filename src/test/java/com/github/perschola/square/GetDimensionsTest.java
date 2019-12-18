package com.github.perschola.square;

import com.github.perschola.Polygon;
import com.github.perschola.Shape;
import com.github.perschola.Square;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/17/2019.
 */
public class GetDimensionsTest {
    // given
    private void test(Integer expectedWidth) {
        Square square = new Square(expectedWidth);
        Shape squareAsPolygon = (Shape) (Object) square;
        String expectedDimensions = new StringBuilder()
                .append("My width is ")
                .append(expectedWidth)
                .append(". My height is")
                .append(expectedWidth)
                .toString();

        // when
        String actualDimensions = squareAsPolygon.getDimensions();

        // then
        Assert.assertEquals(expectedDimensions, actualDimensions);
    }

    @Test
    public void test0() {
        test(1);
    }


    @Test
    public void test1() {
        test(3);
    }

    @Test
    public void test2() {
        test(999);
    }
}
