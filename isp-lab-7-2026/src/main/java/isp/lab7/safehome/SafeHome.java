package isp.lab7.safehome;

public class SafeHome {

    public static void main(String[] args) {
        DoorLockController doorLockController=new DoorLockController();
        try{
            doorLockController.addTenant("1111", "Marina");
            doorLockController.addTenant("2222", "Gica");
            System.out.println(doorLockController.enterPin("1111"));
            System.out.println(doorLockController.enterPin("0000"));
        } catch (Exception e) {
            System.out.println("Error!" + e.getLocalizedMessage());
        }

    }
}
