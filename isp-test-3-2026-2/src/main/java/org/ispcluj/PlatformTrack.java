package org.ispcluj;

//TODO: REQ-4 and REQ-6 transition tracking

// this is a consumer thread that takes the train from the terminal station queue and processes boarding workflows.
// It should also track the state of the platform track (e.g., occupied, blocked, vacant)
// and handle any exceptions that may arise (e.g., signal validation alerts).
public class PlatformTrack implements Runnable{
    private TerminalStation terminalStation;
    private PlatformState currentState;
    private boolean running;

    public PlatformTrack(TerminalStation terminalStation, PlatformState currentState, boolean running){
        this.terminalStation=terminalStation;
        this.currentState=currentState;
        this.running=running;
    }
    @Override
    public void run(){
        while(running){
            if()
        }
    }
    public void updateState(PlatformState state){
        this.currentState;
    }
    public void shutDown(){
        running=false;
    }
}





