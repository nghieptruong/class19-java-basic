package oop;

import java.util.List;

public class Teacher extends Person {

    private List<String> subjects;

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Teaching Subjects: " + subjects);
    }

    //phuong thuc rieng cua teacher
    void research() {
        System.out.println("Researching new technology ...");
    }
}
