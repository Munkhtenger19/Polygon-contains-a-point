/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment1;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Munkhtenger
 */
public class Main {
    public static void main(String[] args) {
        DataHandling data=new DataHandling();
        try{
            data.read("test1.txt");   
        }catch (FileNotFoundException ex) {
            System.out.println("File not found!");
            System.exit(-1);
        }catch (EmptyFileException ex) {
            System.out.println("Given file is empty");
            System.exit(-1);
        }catch (InvalidInputException ex) {
            System.out.println("The line must start with one of these letters \"c, s, t, h, C, S, T, H\"") ;
            System.exit(-1);
        }catch (NullPointerException ex) {
            System.out.println("The number of shapes do not match with first number!");
            System.exit(-1);
        }catch (IndexOutOfBoundsException ex) {
            System.out.println("There should be exactly 4 entries per line!");
            System.exit(-1);
        } 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Give x and y coordinates of the point.");
        System.out.print("x: ");
        double x = sc.nextDouble();
        System.out.print("y: ");
        double y = sc.nextDouble();
        Point a = new Point(x,y);
        int insideShapes=0;

        for(Shape shape : data.shapes){
            if(shape.containsPoint(a)){
                insideShapes++;
            }
        }
        System.out.println("The number of shapes that contains the entered point: " + insideShapes);
    }
}
