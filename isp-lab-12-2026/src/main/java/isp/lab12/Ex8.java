package isp.lab12;

import java.util.List;
import java.util.stream.Collectors;

public class Ex8 {
    public List<Product> filterProducts(List<Product> products){
        return products.stream()
                .filter(p->p.getCategory().equals("Electronics"))
                .sorted((p1, p2)-> Double.compare(p1.getPrice(), p2.getPrice()))
                .collect(Collectors.toList());
    }
}
