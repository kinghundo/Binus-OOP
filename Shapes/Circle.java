/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

/**
 *
 * @author Administrator
 */
public class Circle {
    private double radius;
    private double degreeAngle;
    
    public Circle(double rad){
        this.radius=rad;
    }
    
    public void setRadius(double r){
        if(r<0){
            radius=0;
        }
        else{
            radius=r;
        }
    }
    
    public void setAngle (double deg){
        if(deg<0){
            degreeAngle=360-deg;
        }
        else{
            degreeAngle=deg;
        }
    }
    
    public double getRadius(){
        return radius;
    }
    
    public double getAngle(){
        return degreeAngle;
    }
//-----------------------------------------------------------------------------
    public double getDiameter(){
        return 2*radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    public double getCircumference(){
        return 2*radius*Math.PI;
    }
    public double getSector(){
        return (degreeAngle/360)*Math.PI*Math.pow(radius, 2);
    }
    public double getArc(){
        return (degreeAngle/360)*2*radius*Math.PI;
    }
}
