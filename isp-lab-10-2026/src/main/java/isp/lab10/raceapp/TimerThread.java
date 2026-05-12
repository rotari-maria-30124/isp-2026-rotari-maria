package isp.lab10.raceapp;

public class TimerThread extends Thread{
    private long time;
    private boolean running;
    public TimerThread(){
        this.time=0;
        running=true;
    }
    @Override
    public void run(){
        while(running) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            time++;
        }
    }
    public void stopTimer(){
        running=false;
    }

    public long getTime() {
        return time;
    }
}
