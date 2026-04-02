package isp.lab5.exercise1;

public class Customer {
    private String customerId;
    private  String name;
    private String phone;
    Address address;

    public Customer(String customerId, String name, String phone, Address address){
        this.customerId=customerId;
        this.name=name;
        this.phone=phone;
        this.address=address;
    }
    @Override
    public String toString(){
        return "Customer: \n" +
                "customer ID='" + customerId + '\n' +
                ", name='" + name + '\n' +
                ", phone='" + phone + '\n' +
                ", address= " + address +
                '}';
    }
}
