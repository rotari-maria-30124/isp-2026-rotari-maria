package isp.lab7.safehome;

public class DoorLockController {




    public DoorStatus enterPin(String pin) throws InvalidPinException{
        if(pin.equals("1")){
            return DoorStatus.CLOSE;
        }
    }
}
