package com.example.w23comp1008s2w10;

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
}