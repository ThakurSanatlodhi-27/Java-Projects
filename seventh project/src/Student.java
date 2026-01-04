import java.util.*;
public class Student {
    String name;
    int marks[] = new int[5];
    int total;
    double percentage;
    String grade;

    Student(String name, int marks[]) {
        this.name = name;
        this.marks = marks;
        calculate();
    }

    void calculate() {
        total = Arrays.stream(marks).sum();
        percentage = total / 5.0;
        if (percentage >= 90) grade = "A";
        else if (percentage >= 75) grade = "B";
        else if (percentage >= 60) grade = "C";
        else if (percentage >= 40) grade = "D";
        else grade = "F";
    }
    void displayReport(){
        System.out.println("report carde for name: "+name);
        System.out.println("marks: "+Arrays.toString(marks));
        System.out.println("total: "+total);
        System.out.println("percentage: "+percentage+"%");
        System.out.println("grade: "+grade);
    }
}
