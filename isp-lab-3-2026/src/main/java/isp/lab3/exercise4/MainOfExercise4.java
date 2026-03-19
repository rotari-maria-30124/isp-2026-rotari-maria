package isp.lab3.exercise4;

public class MainOfExercise4 {
    public static void main(String[] args){
        MyPoint p1=new MyPoint(3,5,8);
        MyPoint p2=new MyPoint(7,6,2);
        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);
        System.out.println("Distance between p1 and p2: " + p1.Distance(p2));
    }
}
