package basic;

import java.util.HashSet;
import java.util.Iterator;

public class DemoHashSet {
    public static void main(String[] args) {
        //Set ko cho phep gia tri trung lap
        HashSet<String> setNames = new HashSet<>();
        System.out.println(setNames.size()); // 0
        setNames.add("John");
        setNames.add("Alice");
        setNames.add("Anna");
        setNames.add("James");
        setNames.add("John");
        System.out.println(setNames);

        setNames.remove("Anna");
        System.out.println("After removing:");
        System.out.println(setNames);

        //kiem tra co chua item la John ?
        boolean isContainJohn = setNames.contains("John");
        System.out.println(isContainJohn);
        boolean isContainTom = setNames.contains("Tom");
        System.out.println(isContainTom);

        //duyet set bang for each
        for(String name : setNames) {
            System.out.println(name);
        }

        //duyet iterator
        Iterator<String> iter = setNames.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }



    }
}
