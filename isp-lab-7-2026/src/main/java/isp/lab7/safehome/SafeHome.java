package isp.lab7.safehome;

public class SafeHome {

    public static void main(String[] args) {
        DoorLockController doorLockController=new DoorLockController();
        try{
            doorLockController.addTenant("1111", "Marina");
            //doorLockController.addTenant("2222", "Gica");
            System.out.println(doorLockController.enterPin("1111"));
            DoorStatus status1=doorLockController.enterPin("1111");
            System.out.println(status1);
            //System.out.println(doorLockController.enterPin("0200"));
            doorLockController.addTenant("3333", "Cata");
            System.out.println(doorLockController.enterPin("3333"));
            DoorStatus status2=doorLockController.enterPin("0000");
            System.out.println(status2);
        } catch (Exception e) {
            System.out.println("Error! " + e.getLocalizedMessage());
        }

    }
}
