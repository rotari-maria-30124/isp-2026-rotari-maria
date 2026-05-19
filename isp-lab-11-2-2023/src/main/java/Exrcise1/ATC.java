package Exrcise1;

import java.util.HashMap;
import java.util.Map;

public class ATC {
    private Map<String, Aircraft> aircrafts;

    public ATC(HashMap<String, Aircraft> aircrafts){
        this.aircrafts=aircrafts;
    }

    public void addAircrafts(String id){
        if(this.aircrafts.containsKey(id)){
            System.out.println("Aircraft " + id + "already exists");
        }
        else{
            Aircraft a=new Aircraft(id);
            this.aircrafts.put(id, a);
            System.out.println("Aircraft " + id + "added");
            Thread t=new Thread(a);
            t.start();
        }
    }
    public void addCommand(String aircraftId, AtcCommand cmd){
        Aircraft aircraft=this.aircrafts.get(aircraftId);
        if(aircraft==null){
            System.out.println("Aircraft " + aircraftId + "does not exists");
        }
        else {
            aircraft.receiveAtcCommand(cmd);
        }
    }
    public void showAircrafts(){
        for(Aircraft a : this.aircrafts.values()){
            System.out.println(a);
        }
    }
}
