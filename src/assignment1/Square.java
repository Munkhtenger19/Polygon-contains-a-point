/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

/**
 *
 * @author Munkhtenger
 */
public class Square extends Shape {
    /**
     * This is a constructor for Square.It gets center and side length and forms a square 
     * @param center attribute which has a type of Point. Center point for creating a square.
     * @param side_length side length for creating a square.
     */
    public Square(Point center,double side_length){
        super(center,side_length);
    }
    /**
     * Method for checking if the given point is inside the square or not.
     * @param a Point's coordinate is now checked if it is inside the square or not.
     * @return boolean type value whether point is inside the square or not. 
     */
    @Override
    public boolean containsPoint(Point a){
        return center.getX() - side_length/2 <= a.getX() && center.getX() + side_length/2 >= a.getX() 
                && center.getY() - side_length/2 <= a.getY() && center.getY() + side_length/2 >= a.getY(); 
    }
    /**
     * Converts square details into string form.
     */
    @Override
    public String toString() {
        return "Square (center: "+center+", side length: "+side_length+")"; 
    }
    
}
