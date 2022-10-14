/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

//import java.util.Arrays;
//import java.util.List;

/**
 *
 * @author Munkhtenger
 */
public class Hexagon extends Shape {
    private final double height;
    private final Point[] vertices;
    
    /**
     * This is a constructor for Hexagon.It gets center and side length and forms a hexagon.
     * Sets the 6 vertices by finding the height of the hexagon.
     * @param center attribute which has a type of Point. Center point for creating a hexagon.
     * @param side_length each side length of the hexagon.
     */
    public Hexagon(Point center, double side_length){
        super(center,side_length);
        this.height=Math.sqrt(3)*side_length;
        
        this.vertices=new Point[6];
        vertices[0]=new Point(center.getX() - side_length,center.getY());
        vertices[1]=new Point(center.getX() - side_length/2,center.getY() + height/2);
        vertices[2]=new Point(center.getX() + side_length/2,center.getY() + height/2);
        vertices[3]=new Point(center.getX() + side_length,center.getY());
        vertices[4]=new Point(center.getX() + side_length/2,center.getY() - height/2);
        vertices[5]=new Point(center.getX() - side_length/2,center.getY() - height/2);
    }
    
    public double getHeight(){return height;}
    
    /**
     * Method for checking if the given point is inside the hexagon or not.
     * @param a Point's coordinate is now checked if it is inside the hexagon or not.
     * @return boolean type value whether point is inside the hexagon or not. 
     */
    @Override
    public boolean containsPoint(Point a){
        boolean checker=false;
        Triangle[] sectors=new Triangle[6];
        sectors[0]=new Triangle(vertices[0],vertices[1],center);
        sectors[1]=new Triangle(vertices[1],vertices[2],center);
        sectors[2]=new Triangle(vertices[2],vertices[3],center);
        sectors[3]=new Triangle(vertices[3],vertices[4],center);
        sectors[4]=new Triangle(vertices[4],vertices[5],center);
        sectors[5]=new Triangle(vertices[5],vertices[0],center);
        
//        List<Triangle> pieces= Arrays.asList(sectors);
        for(Triangle triangle: sectors){
            if(triangle.containsPoint(a)) checker=true;
        }
        return checker;
    }
    /**
     * Converts hexagon details into string form.
     */
    @Override
    public String toString() {
        return "Hexagon (center: "+center+", radius: "+side_length+")"; 
    }
}
