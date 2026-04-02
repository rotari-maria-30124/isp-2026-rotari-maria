package isp.lab5.exercise2;

public class Exercise2 {
    public static void main(String[] args){
        SmartPhone smartPhone=new SmartPhone(38);
        SmartWatch smartWatch=new SmartWatch(68);
        Laptop laptop=new Laptop(92);
        smartPhone.charge(50);
        smartWatch.charge(20);
        laptop.charge(5);
        System.out.println("Smartphone battery: " + smartPhone.getBatteryLevel());
        System.out.println("Smartwatch battery: " + smartWatch.getBatteryLevel());
        System.out.println("Laptop battery: " + laptop.getBatteryLevel());
    }
}
