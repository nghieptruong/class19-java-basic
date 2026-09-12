package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExMap2 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("John");
        name.add("Thomas"); // x
        name.add("Peter");
        name.add("Alice");
        name.add("John");
        name.add("John");
        name.add("Alice");
        name.add("Tim");
        System.out.println(name);
        Map<String, Integer> map = new HashMap<>();
        for (String count : name) {
            if (map.containsKey(count)) {
                map.put(count, map.get(count) + 1);
            } else {
                map.put(count, 1);
            }
        }
        Set<Map.Entry<String, Integer>> setEntry = map.entrySet();
        for (Map.Entry<String, Integer> entry : setEntry) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
