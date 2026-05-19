package isp.lab12;

import java.util.ArrayList;

public class Ex3 {

    public int findLongestLength(ArrayList<String> list){
        list.stream()
                .mapToInt(s -> s.length())
                .max()
                .orElse(0);
    }
}
