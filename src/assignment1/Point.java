/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

/**
 *
 * @author Munkhtenger
 */
public class Point {
    private double x,y;
    /**
     * This is a constructor for Point class.It gets x and y coordinates and forms a point.
     * @param x coordinate in x-axis
     * @param y coordinate in y-axis
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {return x;}
    
    public double getY() {return y;}
    
    public void setX(double x) {this.x = x;}
    
    public void setY(double y) {this.y = y;}

    /**
     * Converts point coordinates into string form.
     */
    @Override
    public String toString() {
        return "Point(" + "x=" + x + ", y=" + y + ')';
    }
    
}
