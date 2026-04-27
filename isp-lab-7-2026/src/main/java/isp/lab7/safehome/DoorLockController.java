package isp.lab7.safehome;

import java.util.HashMap;
import java.util.Map;
public class DoorLockController {
    private Map<Tenant, AccessKey> validAccess=new HashMap<>();
    private Door door=new Door();
    private int attempts=0;

    private final String MASTER_PIN="0000";
    public DoorStatus enterPin(String pin) throws Exception{
        if(pin.equals("1")){
            door.unlockDoor();
            return door.getStatus();
        }
        if (pin.equals(MASTER_PIN)){
            attempts=0;
            door.unlockDoor();
            return door.getStatus();
        }
        for (Tenant tenant:validAccess.keySet()){
            if(validAccess.get(tenant).getPin().equals(pin)){
                attempts=0;
                if(door.getStatus()==DoorStatus.CLOSE){
                    door.unlockDoor();
                }else{
                    door.lockDoor();
                }
                return door.getStatus();
            }
        }
        attempts++;
        if(attempts>=3){
            throw new TooManyAttemptsException();
        }
        throw new InvalidPinException();
    }
    public void addTenant(String pin, String name) throws Exception{
        Tenant tenant=new Tenant(name);
        if(validAccess.containsKey(tenant)){
            throw new TenantAlreadyExistsException();
        }
        validAccess.put(tenant, new AccessKey(pin));
    }
    public void removeTenant(String name) throws Exception{
        Tenant tenant=new Tenant(name);
        if(!validAccess.containsKey(tenant)){
            throw new TenantNotFoundException();
        }
        validAccess.remove(tenant);
    }
}
