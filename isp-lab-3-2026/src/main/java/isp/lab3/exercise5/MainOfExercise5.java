package isp.lab3.exercise5;

public class MainOfExercise5 {
    public static void main(String[] args){
            VendingMachine v=new VendingMachine();
        System.out.println((v.toString()));
            v.userMenu();
            v.displayProducts();
            v.insertCoin(15);
            v.displayCredit();
            String result=v.selectProduct(3);
        System.out.println("Selected product: " + result);
        v.displayCredit();
    }
}
