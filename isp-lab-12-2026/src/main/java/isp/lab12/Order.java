package isp.lab12;

public class Order {
    private int id;
    private double total;
    private String status;

    public Order(int id, double total, String status){
        this.id=id;
        this.total=total;
        this.status=status;
    }

    public int getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    public String getStatus() {
        return status;
    }
}
