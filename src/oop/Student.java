package oop;

public class Student extends Person {

    private double avgGrade;

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    //override:
    //1. Ke thua cha con
    //2. Cung ten ham
    //3. Cung tham so
    //4. Pham vi cua class con >= pham vi cua class cha
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Avg Grade: " + avgGrade);
    }

    //phuong thuc rieng cua student
    void viewGrade() {
        System.out.println("Your Summary Subjects: ");
        // To-Do
    }
}
