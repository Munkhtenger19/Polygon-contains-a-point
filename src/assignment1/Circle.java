/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

/**
 *
 * @author Munkhtenger
 */
public class Circle extends Shape {
    /**
     * This is a constructor for Circle.It gets center and radius and forms a circle.
     * @param center attribute which has a type of Point. Center point for creating a circle.
     * @param side_length radius of the circle.
     */
    public Circle(Point center,double side_length){
        super(center,side_length);
    }
    /**
     * Method for checking if the given point is inside the circle or not.
     * @param a Point's coordinate is now checked if it is inside the circle or not.
     * @return boolean type value whether point is inside the circle or not. 
     */
    @Override
    public boolean containsPoint(Point a){
        return (a.getX()-center.getX())*(a.getX()-center.getX())+
                (a.getY()-center.getY())*(a.getY()-center.getY()) <= side_length*side_length;
    }
    /**
     * Converts circle details into string form.
     */
    @Override
    public String toString() {
        return "Circle (center: "+center+", radius: "+side_length+")"; 
    }
}
