package isp.lab12;

import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {
    public List<String> upperCase(List<String> list){
        return list.stream()
                .map(s->s.toUpperCase())
                .collect(Collectors.toList());
    }
}
