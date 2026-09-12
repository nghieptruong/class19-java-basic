package basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        HashMap<String, Integer> mapStudents = new HashMap<>();
        mapStudents.put("John", 9);
        mapStudents.put("Alice", 8);
        mapStudents.put("Tom", 7);

        System.out.println(mapStudents);

        mapStudents.put("John", 10);
        System.out.println("After updating:");
        System.out.println(mapStudents);

        //duyet map
        System.out.println(mapStudents.size());
        Set<Map.Entry<String,Integer>> setEntry = mapStudents.entrySet();
        for(Map.Entry<String,Integer> entry : setEntry) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


    }
}
