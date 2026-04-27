package isp.lab6.exercise3;

public class Exercise3 {

    public static void main(String[] args) {
        OnlineStore store=new OnlineStore();
        store.addProduct(new Product("Incarcator", 100));
        store.addProduct(new Product("Telefon", 5000));
        store.addProduct(new Product("Husa", 50));
        LoginSystem loginSyst=new LoginSystem(store);
        UserInterface userInterface=new UserInterface(loginSyst, store);
        userInterface.loadInterface();;
    }
}
