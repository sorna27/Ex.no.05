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
public class bond {
    public static void main(String arg[]){
        int i,j;
        Scanner obj=new Scanner (System.in);
        bond1 b[]=new bond1[6];
        convertilebond c[]=new convertilebond[6];
        System.out.println("To print bond enter 1...\nTo print convertilebond enter 2");
        for(i=0;i<6;i++)
        {
            
            j=obj.nextInt();
            switch(j)
            {
                case 1:
                {
                    b[j]=new bond1();
                    b[j].method();
                    break;
                }
                case 2:
                {
                    c[j]=new convertilebond();
                    c[j].method();
                    break;
                }
                default:
                    System.out.println("Wrong input...");
            }
        }
    }
}
class bond1
{
    public void method()
    {
        System.out.println("BOND...");
    }
}
class convertilebond extends bond
{
    public void method()
    {
        System.out.println("CONVERTILEBOND...");
    }
}