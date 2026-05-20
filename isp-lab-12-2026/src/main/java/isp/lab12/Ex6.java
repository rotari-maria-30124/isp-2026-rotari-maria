package isp.lab12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex6 {
    public Map<Character, List<String>> groubByTheirFirstLetter(List<String> list){
        return list.stream()
                .collect(Collectors.groupingBy(s->s.charAt(0)));
    }
}
