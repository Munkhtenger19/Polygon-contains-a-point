/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Munkhtenger
 */
public class DataHandling {
    public ArrayList<Shape> shapes;
    /**
     *
     * Constructor for data handling class
     */
    public DataHandling() {
        shapes = new ArrayList<>();
    }
    /**
     * Method for reading and handling the file.
     * @param filename file name
     */
    public void read(String filename) throws FileNotFoundException, InvalidInputException,IndexOutOfBoundsException,NullPointerException, EmptyFileException{
        Scanner sc = new Scanner(new BufferedReader(new FileReader(filename)));
        if(!sc.hasNext()) throw new EmptyFileException();
        int numShapes=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<numShapes;i++){
            if(!sc.hasNextLine()) throw new NullPointerException();
            String[] details=sc.nextLine().split(" ");
            if(details.length!=4)throw new IndexOutOfBoundsException();
            String shapeType=details[0].toLowerCase();
            double x=Double.parseDouble(details[1]);
            double y=Double.parseDouble(details[2]);
            double side_length=Double.parseDouble(details[3]);
            switch (shapeType) {
                case "c" -> shapes.add(new Circle(new Point(x,y),side_length));
                case "t" -> shapes.add(new Triangle(new Point(x,y),side_length));
                case "s" -> shapes.add(new Square(new Point(x,y),side_length));
                case "h" -> shapes.add(new Hexagon(new Point(x,y),side_length));
                default -> throw new InvalidInputException();
            }
        }
    }               
}