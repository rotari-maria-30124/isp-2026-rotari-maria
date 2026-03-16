package isp.lab3.exercise1;

public class MainOfExercise1 {
    public static void main(String[] args){
        Tree t1=new Tree();
        System.out.println(t1.toString());

        Tree t2=new Tree(17);
        System.out.println(t2.toString());
        t2.grow();
        System.out.println(t2.toString());
        t2.grow(10);
        System.out.println(t2.toString());
    }
}