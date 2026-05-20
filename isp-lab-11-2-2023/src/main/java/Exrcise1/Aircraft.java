package Exrcise1;

import java.util.Objects;

public class Aircraft implements Runnable {
    private String id;
    private int altitude;
    private State state;
    private final Object lock;
    private int assignedAltitude;
    private long cruiseTime;

    public Aircraft(String id) {
        this.id = id;
        this.altitude = 0;
        this.state = State.ON_STAND;
        this.lock = new Object();
        System.out.println("Aircraft " + id + " is created. Ready to take off. State: " + state);
        this.assignedAltitude = 0;
        this.cruiseTime=0;
    }

    public void receiveAtcCommand(AtcCommand atcCommand) {
        if (atcCommand instanceof TakeOffCommand && this.state == State.ON_STAND) {
            this.assignedAltitude=((TakeOffCommand) atcCommand).getAltitude();
            takeOff();
        } else if (atcCommand instanceof LandCommand) {
            land();
        }
    }

    private void takeOff() {
        synchronized (lock) {
            lock.notify();
        }
    }

    private void land() {
        if (this.state == State.CRUISING) {
            synchronized (lock) {
                lock.notify();
            }
        } else System.out.println("Aircraft " + id + " cannot receive land command. Current state: " + state);
    }

    public State getState() {
        return state;
    }

    public String getId() {
        return id;
    }

    @Override
    public void run() {
        System.out.println("Aircraft " + id + " is waiting for TAKEOFF_CMD");
        synchronized (lock) {
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.state = State.TAXIING;
        System.out.println("Aircraft " + id + " is taxiing");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.state = State.TAKING_OFF;
        System.out.println("Aircraft " + id + " is taking off");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.state = State.ASCENDING;
        System.out.println("Aircraft " + id + " is ascending");
        try {
            while (this.altitude < this.assignedAltitude) {
                Thread.sleep(10000);
                this.altitude += 1000;
                System.out.println("Aircraft " + id + " is ascending. Current altitude: " + this.altitude);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.state = State.CRUISING;
        cruiseTime=System.currentTimeMillis();
        System.out.println("Aircraft " + id + " reached cruising altitude. Current altitude: " + this.altitude);
        synchronized (lock) {
            try {
                System.out.println("Aircraft " + id + " is waiting for LAND_CMD.");
                lock.wait();
                System.out.println("Aircraft " + id + " received LAND_CMD.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.state=State.DESCENDING;
        System.out.println("Aircraft " + id + " is descending");
        try{
            while(this.altitude>0){
                this.altitude-=1000;
                System.out.println("Aircraft " + id + " is descending. Current altitude: " + this.altitude);
                Thread.sleep(10000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.state=State.LANDED;
        System.out.println("Aircraft " + id + " landed");
        long cruiseT=(System.currentTimeMillis()-cruiseTime/1000);
        System.out.println("Aircraft " + id + " spent " + cruiseTime + " seconds cruising");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return Objects.equals(id, aircraft.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "id='" + id + '\'' +
                ", altitude=" + altitude +
                ", state=" + state +
                ", assignedAltitude=" + assignedAltitude +
                '}';
    }
}
