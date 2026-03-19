package isp.lab3.exercise5;

public class VendingMachine {
    private String[] products;
    private int[] prices;
    private int credit;
     public VendingMachine(){
       products=new String[]{"Juice", "Water", "Snacks", "Protein Bar"};
       prices=new int[]{9, 7, 6, 5};
       credit=0;
     }
     public void displayProducts(){
         System.out.println("Available products: ");
         for (int i = 0; i < products.length; i++) {
             System.out.println(i + " - " + products[i] + " : " + prices[i] + " lei ");
         }
     }
     public void insertCoin(int value){
         if(value>0){
             credit+=value;
         }
         else{
             System.out.println("Invalid coin value");
         }
     }
     public String selectProduct(int id){
         if(id<0 || id>=products.length){
             return "Invalid product id";
         }
         if(credit<prices[id]){
             return "Not enough credit";
         }
         credit=credit-prices[id];
         return products[id];
     }
     public void displayCredit(){
         System.out.println("Current credit: " + credit + " lei");
     }
     public void userMenu(){
         System.out.println("VENDING MACHINE MENU:");
         System.out.println("1. Display products");
         System.out.println("2. Insert coin");
         System.out.println("3. Select product");
         System.out.println("4. Display credit");
     }
    public String[] getProducts() {
        return products;
    }
    public int[] getPrices() {
        return prices;
    }
    public int getCredit() {
        return credit;
    }
    @Override
    public String toString(){
            return "Products: " + products.length + ", credit: " + credit;
    }
}
