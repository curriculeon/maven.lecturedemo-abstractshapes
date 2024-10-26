package com.github.perschola.circle;

import com.github.perschola.Circle;
import com.github.perschola.Shape;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/17/2019.
 */
public class GetDimensionsTest {
    // given
    private void test(Integer expectedWidth) {
        Circle circle = new Circle();
        circle.setWidth(expectedWidth);
        Shape squareAsPolygon = (Shape) (Object) circle;
        String expectedDimensions = new StringBuilder()
                .append("My dimensions are ")
                .append("(3.14 * ")
                .append(expectedWidth)
                .append(" squared")
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
