import java.util.Scanner;

public class ReportCard{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter student name");
        String name=sc.nextLine();
        int marks[]=new int[5];
        String subject[]={"math","english","Science","history","hindi"};
        for(int i=0;i<5;i++){
            System.out.print("enter marks for"+subject[i]+": ");
            marks[i]=sc.nextInt();
        }
        Student s=new Student(name,marks);
        s.displayReport();

    }
}