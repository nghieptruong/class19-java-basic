package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoInheritance {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Tom");
        s1.setAge(25);
        s1.setAddress("111 Street A");
        s1.setAvgGrade(7.5);

        s1.displayInfo();

        Teacher t1 = new Teacher();
        t1.setName("Jimmy");
        t1.setAge(34);
        t1.setAddress("222 Street B");

//        List<String> subjects = new ArrayList<>();
//        subjects.add("Programming");
//        subjects.add("Networking");
//        t1.setSubjects(subjects);

        t1.setSubjects(Arrays.asList("Programming", "Networking"));

        t1.displayInfo();
    }
}
