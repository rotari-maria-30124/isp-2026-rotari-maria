package isp.lab6.exercise3;

import java.util.Scanner;

public class UserInterface {

    private LoginSystem loginSyst;
    private OnlineStore store;

    public UserInterface(LoginSystem loginSystem, OnlineStore store) {
        this.loginSyst = loginSystem;
        this.store = store;
    }
    public void loadInterface() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username:");
        String username = scanner.nextLine();
        System.out.println("Password:");
        String password = scanner.nextLine();
        loginSyst.register(username, password);
        if (loginSyst.login(username, password)) {
            System.out.println("Logged in!\n");
            System.out.println("Products available:");
            for (Product p : store.getProducts()) {
                System.out.println(p);
            }
            if (!store.getProducts().isEmpty()) {
                Product p = store.getProducts().get(0);
                store.addToCart(username, p, 2);
                System.out.println("\nAdded to cart: " + p.getName());
            }
            System.out.println("\nCheckout:");
            store.checkout(username);
            loginSyst.logout(username);
            System.out.println("Logout done.");
        } else {
            System.out.println("Login failed.");
        }
    }
}