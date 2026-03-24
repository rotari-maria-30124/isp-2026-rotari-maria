package edu.tucn.aut.isp.lab4.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        FishFeeder fishFeeder= new FishFeeder("JBL", "PRONOVO AUTOFOOD");
        System.out.println(fishFeeder);
        fishFeeder.fillUp();
        fishFeeder.feed();
    }
}
