package com.github.perschola.circle;

import com.github.perschola.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 12/17/2019.
 */
public class PolymorphismTest {
    @Test
    public void testSquare() {
        // given
        Circle circle = new Circle();

        // when
        Boolean isSquare = (Object) circle instanceof Square;

        // then
        Assert.assertFalse(isSquare);
    }

    @Test
    public void testRectangle() {
        // given
        Circle circle = new Circle();

        // when
        Boolean isRectangle = (Object) circle instanceof Rectangle;

        // then
        Assert.assertFalse(isRectangle);
    }

    @Test
    public void testPolygon() {
        // given
        Circle circle = new Circle();

        // when
        Boolean isPolygon = (Object) circle instanceof Polygon;

        // then
        Assert.assertTrue(isPolygon);
    }

    @Test
    public void testShape() {
        // given
        Circle circle = new Circle();

        // when
        Boolean isShape = (Object) circle instanceof Shape;

        // then
        Assert.assertTrue(isShape);
    }
}
