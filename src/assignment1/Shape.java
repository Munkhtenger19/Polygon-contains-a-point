/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment1;

/**
 *
 * @author Munkhtenger
 */
public abstract class Shape {
    protected Point center;
    protected double side_length;
    /**
     * This is a constructor for Shape class. A shape is formed with a center point and side length.
     * @param center coordinate in x-axis and y-axis.
     * @param side_length side length's value type of a double 
     */
    public Shape(Point center, double side_length) {
        this.center = center;
        this.side_length = side_length;
    }
    /**
     * Abstract method for checking if the given point is inside the shape or not.
     * @param a point's coordinate which now checked if it is inside the shape or not.
     * @return boolean type value whether point is inside the shape or not. 
     */
    public abstract boolean containsPoint(Point a);
}
