package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExMap {
    public static void main(String[] args) {
        /*
            Có 1 danh sách list các tên: John, Alice, Thomas, Peter, Alice, John, John, Tim
            Đếm số lần xuất hiện của mỗi phần tử
            Kết quả:
                John = 3
                Alice = 2
                Thomas = 1
                Peter = 1
                Tim = 1
            Gợi ý: ArrayList, Map
         */
        ArrayList<String> listNames = new ArrayList<>();
        listNames.add("John");
        listNames.add("Alice");
        listNames.add("Thomas");
        listNames.add("Peter");
        listNames.add("Alice");
        listNames.add("John");
        listNames.add("John");
        listNames.add("Tim");

        Map<String, Integer> mapCount = new HashMap<>();

        for (int i = 0; i < listNames.size(); i++) {
            String name = listNames.get(i);
            int count = 0;
            for(int j = 0; j < listNames.size(); j++) {
                if (name.equals(listNames.get(j))) {
                    count++;
                }
                mapCount.put(name, count);
            }

        }
        Set<Map.Entry<String, Integer>> entrySet = mapCount.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
