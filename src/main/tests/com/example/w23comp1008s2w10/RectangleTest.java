package com.example.w23comp1008s2w10;

import org.junit.Test;

import org.junit.jupiter.api.Assertions;
import static org.junit.Assert.*;

public class RectangleTest {

    private Rectangle rectangle;

    @org.junit.Before
    public void setUp() throws Exception {
        rectangle = new Rectangle(20,30);
    }

    @org.junit.Test
    public void setHeight() {
        rectangle.setHeight(30);
        assertEquals(30, rectangle.getHeight(),0.0);
    }

    @org.junit.Test
    public void setWidth() {
        rectangle.setWidth(50);
        assertEquals(50, rectangle.getWidth(),0.0);
    }

    @org.junit.Test
    public void getArea(){
        //rectangle is 20 x 30, so area should be 600
        assertEquals(600, rectangle.getArea(), 0.00000001);
    }

    @org.junit.Test
    public void getPerimeter(){
        //rectangle is 20 x 30, the perimeter should be 20 + 30 + 20 + 30 = 100
        assertEquals(100, rectangle.getPerimeter(), 0.00000001);
    }

    @Test
    public void setWidthInvalid(){
        //if the user enters a width of 0, it is no longer a rectangle, it is a line
        Assertions.assertThrows(IllegalArgumentException.class, () ->{ rectangle.setWidth(0);});
    }

    @Test
    public void setWidthInvalidNegative(){
        //if the user enters a width of 0, it is no longer a rectangle, it is a line
        Assertions.assertThrows(IllegalArgumentException.class, () ->{ rectangle.setWidth(-1);});
    }

    @Test
    public void setHeightInvalid(){
        //if the user enters a width of 0, it is no longer a rectangle, it is a line
        Assertions.assertThrows(IllegalArgumentException.class, () ->{ rectangle.setHeight(0);});
    }

    @Test
    public void setHeightInvalidNegative(){
        //if the user enters a width of 0, it is no longer a rectangle, it is a line
        Assertions.assertThrows(IllegalArgumentException.class, () ->{ rectangle.setHeight(-1);});
    }

    @Test
    public void constructorInvalidHeight(){
        //if the user enters a width of 0, it is no longer a rectangle, it is a line
        Assertions.assertThrows(IllegalArgumentException.class, () ->{ new Rectangle(0,10);});
    }

    @Test
    public void constructorInvalidWidth(){
        //if the user enters a width of 0, it is no longer a rectangle, it is a line
        Assertions.assertThrows(IllegalArgumentException.class, () ->{ new Rectangle(10,0);});
    }
}