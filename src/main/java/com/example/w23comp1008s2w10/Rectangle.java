package com.example.w23comp1008s2w10;

public class Rectangle {
    private double height, width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height>0)
            this.height = height;
        else
            throw new IllegalArgumentException("height must be greater than 0");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width>0)
            this.width = width;
        else
            throw new IllegalArgumentException("Width must be greater than 0");
    }

    public double getArea()
    {
        //rectangle is 20 x 30, so area should be 600
        return width * height;
    }

    public double getPerimeter()
    {
        return 2*width + 2* height;
    }
}
