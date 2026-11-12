import java.util.Scanner;
public class StudentGrading{
    public static void main(String[] args) {
        Scanner input= new (Scanner(System.in));
        System.out.print("Enter student name: ");
        String name=input.nextLine();
        System.out.print("Enter student score: ");
        int score=input.nextInt();
        if(score>=70){
            System.out.println("GRADE: A");
        }
        else if(score>=60){
            System.out.println("GRADE: B");
        }
        else if(score>=50){
            System.out.println("GRADE: C");
        }
        else if(score>=40){
            System.out.println("GRADE: D");
        }
        else{
            System.out.println("GRADE: F');}
            System.out.println("Student Name: " + name);
            input.close();
    }
}