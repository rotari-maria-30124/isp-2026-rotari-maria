package isp.lab3.exercise2;

import java.util.RandomAccess;

public class MainOfExercise2 {
    public static void main (String[] args){
        Rectangle r1=new Rectangle();
        System.out.println(r1.toString());
        System.out.println("Area " + r1.getArea());
        System.out.println("Perimeter " + r1.getPerimeter());

        Rectangle r2=new Rectangle(4,5);
        System.out.println(r2.toString());
        System.out.println("Area " + r2.getArea());
        System.out.println("Perimeter " + r2.getPerimeter());

        Rectangle r3=new Rectangle(2,3, "midnight");
        print(r3);
    }
    public static void print(Rectangle(r)){
        Rectangle r=new Rectangle();
        System.out.println(r.toString());
        System.out.println("Area " + r.getArea());
        System.out.println("Perimeter " + r.getPerimeter());
    }
}
