package org.ispcluj;

import java.util.List;

//TODO: REQ-3 and handle REQ1's uniqueness check
public class TrafficController implements Runnable{
    private TerminalStation terminalStation;
    private List<Train> rawSchedule;

    public TrafficController(TerminalStation terminalStation, List<Train> rawSchedule){
        this.terminalStation=terminalStation;
        this.rawSchedule=rawSchedule;
    }
    @Override
    public void run(){
        for (Train train:rawSchedule){
            try {
                System.out.println("Dispatching train: " + train);
                terminalStation.enqueueTrain(train);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
