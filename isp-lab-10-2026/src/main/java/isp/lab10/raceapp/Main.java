package isp.lab10.raceapp;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Semaphore");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SemaphorePanel semaphorePanel = new SemaphorePanel();

        frame.getContentPane().add(semaphorePanel);
        frame.pack();
        frame.setVisible(true);

        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);
        semaphoreThread.start();

        JFrame frame1 = new JFrame("Car Race");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarPanel carPanel = new CarPanel();

        frame1.getContentPane().add(carPanel);
        frame1.pack();
        frame1.setSize(500,300);
        frame1.setVisible(true);

        Car car1 = new Car("Red car", carPanel);
        Car car2 = new Car("Blue car", carPanel);
        Car car3 = new Car("Green car", carPanel);
        Car car4 = new Car("Yellow car", carPanel);

        PlaySound ps = new PlaySound();
        TimerThread t=new TimerThread();

        try {
            semaphoreThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Race!");

        ps.playSound();
        t.start();
        car1.start();
        car2.start();
        car3.start();
        car4.start();
        try {
            car1.join();
            car2.join();
            car3.join();
            car4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t.stopTimer();
        ps.stopSound();

        System.out.println("Race duration: " + (float)t.getTime()/100 + "sec");
    }
}
