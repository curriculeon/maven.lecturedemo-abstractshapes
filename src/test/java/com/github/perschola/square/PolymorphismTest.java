package com.github.perschola.square;

import com.github.perschola.Polygon;
import com.github.perschola.Rectangle;
import com.github.perschola.Shape;
import com.github.perschola.Square;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/17/2019.
 */
public class PolymorphismTest {
    @Test
    public void testRectangle() {
        // given
        Square square = new Square();

        // when
        Boolean isRectangle = (Object) square instanceof Rectangle;

        // then
        Assert.assertTrue(isRectangle);
    }

    @Test
    public void testPolygon() {
        // given
        Square square = new Square();

        // when
        Boolean isPolygon = (Object) square instanceof Polygon;

        // then
        Assert.assertTrue(isPolygon);
    }

    @Test
    public void testShape() {
        // given
        Square square = new Square();

        // when
        Boolean isShape = (Object) square instanceof Shape;

        // then
        Assert.assertTrue(isShape);
    }
}
