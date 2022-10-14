/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

/**
 *
 * @author Munkhtenger
 */
public class Triangle extends Shape {
    private double height;
    private Point vertex1;
    private Point vertex2;
    private Point vertex3;
    private double centerToMidDist;
    
    /**
     * This is a constructor for Triangle.It gets center and side length and forms a triangle. 
     * Sets the 3 vertices by finding the height of the triangle as well as apothem.	
     * @param center attribute which has a type of Point. Center point for creating a triangle.
     * @param side_length each side length of the triangle.
     */
    public Triangle(Point center, double side_length){
        super(center,side_length);
        this.height=side_length*(Math.sqrt(3)/2);
        this.centerToMidDist=height/3;
        this.vertex1=new Point(center.getX(),centerToMidDist*2+center.getY());
        this.vertex2=new Point(center.getX() + side_length/2, center.getY()- centerToMidDist);
        this.vertex3=new Point(center.getX() - side_length/2, center.getY()- centerToMidDist);
    }
    
    public double getHeight() {return height;}

    public Point getVertex1() {return vertex1;}

    public Point getVertex2() {return vertex2;}

    public Point getVertex3() {return vertex3;}
    
    public double getCenterToMidDist() {return centerToMidDist;}
    
    /**
     * This is the second constructor for Triangle. It gets 3 vertices and forms a triangle.
     * @param vertex1 One vertex of the triangle.
     * @param vertex2 One vertex of the triangle.
     * @param vertex3 One vertex of the triangle.
     */
    public Triangle(Point vertex1, Point vertex2, Point vertex3) {
        super(null, 0);
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }
    
    /**
     * A method for calculating the area of triangle by giving three vertices.
     * @param a One vertex of the triangle.
     * @param b One vertex of the triangle.
     * @param c One vertex of the triangle.
     * @return returns the area of the triangle
     */
    public double areaTriangle(Point a,Point b,Point c){
        double first=a.getX()*(b.getY()-c.getY());
        double second=b.getX()*(c.getY()-a.getY());
        double third=c.getX()*(a.getY()-b.getY());
        return Math.abs((first+second+third)/2.0);
    }
    
    /**
     * Method for checking if the given point is inside the triangle or not.
     * @param a Point's coordinate is now checked if it is inside the triangle or not.
     * @return boolean type value whether point is inside the triangle or not. 
     */
    @Override
    public boolean containsPoint(Point a){
        double totalArea=areaTriangle(vertex1,vertex2,vertex3);
        double subArea1=areaTriangle(a,vertex2,vertex3);
        double subArea2=areaTriangle(vertex1,a,vertex3);
        double subArea3=areaTriangle(vertex1,vertex2,a);
        double totalSub=subArea1+subArea2+subArea3;
        return ((double)Math.round(10000000*totalArea))/10000000==((double)Math.round(10000000*totalSub))/10000000;
    }
    
    /**
     * Converts triangle details into string form.
     */
    @Override
    public String toString() {
        return "Reguler triangle (center: "+center+", radius: "+side_length+")"; 
    }
}
