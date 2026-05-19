package isp.lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ex4 {
    //TODO: implement a unit test to see that it works as intended
    //find the sum of all even in a list of integers
    public int sumOfAllEven(ArrayList<Integer> list){
        return list.stream()
                .filter(x->x%2==0)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
