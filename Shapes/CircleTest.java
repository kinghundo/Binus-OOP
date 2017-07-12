/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;
import java.util.Scanner; 

/**
 *
 * @author Administrator
 */
public class CircleTest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double a, r;
        System.out.print("Create a circle with a radius of: ");
        r=s.nextDouble();
        setRadius(r);
        
        Circle c1 = new Circle(r);
        System.out.println("The diameter of the circle is: " + getDiameter());
        System.out.println("The area of the circle is: " + getArea());
        System.out.println("The circumference of the circle is: " + getCircumference());
        System.out.println("Finding sectors and arcs");
        System.out.print("Enter angle in degree: ");
        a=s.nextDouble();
        
        
    }
}
