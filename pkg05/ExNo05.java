/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex.no.pkg05;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class ExNo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        circle c=new circle();
        c.areac();
        c.cc();
        square s=new square();
        s.areas();
        s.diagonal();
        sphere s1=new sphere();
        s1.vol();
        s1.surface();
        
    }
    
}
class shape
{
    double radius;
    double pi=3.14;
    double length;
    double r; 
    Scanner obj=new Scanner(System.in);
    shape(double ra,double l,double r1)
    {
        radius=ra;
        length=l;
        r=r1;
  
    }
    shape()
    {
        
    }
}

class circle extends shape
{
    
    public void areac()
    {
        System.out.println("CIRCLE...");
        System.out.println("enter the radius: ");
        radius=obj.nextDouble();
        double area=pi*radius*radius;
        System.out.println("area="+area);
    }
    public void cc()
    {
        double c=2*pi*radius;
        System.out.println("circumference="+c);
    }
    
}
class square extends shape
        
{

    public void areas()
    {
        System.out.println("SQUARE...");
        System.out.println("enter the side:");
        length=obj.nextDouble();
        double area=length*length;
        System.out.println("area="+area);
    }
    public void diagonal()
    {
        double d=Math.sqrt(2)*length;
        System.out.println("diagonal="+d);
    }
}
class sphere extends shape
{
    public void vol()
    {
        System.out.println("SPHERE...");
        System.out.println("enter the radius=");
        r=obj.nextDouble();
        double volume=(4/3)*pi*r*r*r;
        System.out.println("volume="+volume);
    }
    public void surface()
    {
        double surface=4*pi*r*r;
        System.out.println("surface"+surface);
    }
}