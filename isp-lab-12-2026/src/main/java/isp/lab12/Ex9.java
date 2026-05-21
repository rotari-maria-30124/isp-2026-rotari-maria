package isp.lab12;

import java.util.List;

public class Ex9 {
    public double totalRevenue(List<Order> orders){
        return orders.stream()
                .filter(o->o.getStatus().equals("Completed"))
                .map(o->o.getTotal())
                .reduce(0.0, (a,b)->a+b);
    }
}
