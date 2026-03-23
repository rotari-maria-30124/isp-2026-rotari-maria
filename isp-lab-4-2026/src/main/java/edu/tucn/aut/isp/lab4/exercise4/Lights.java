package edu.tucn.aut.isp.lab4.exercise4;

public class Lights {
    private boolean isOn;
    public Lights(){
        isOn=false;
    }
    public void turnOn(){
        isOn=true;
        System.out.println("Lights is on");
    }
    public void turnOff(){
        isOn=false;
        System.out.println("Lights is off");
    }
}
