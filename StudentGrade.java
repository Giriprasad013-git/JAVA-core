import java.util.Scanner;

public class StudentGrade {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the student's score: ");
    int score = scan.nextInt();

    if (score >= 90 && score <= 100) {
      System.out.println("The student's grade is A.");
    } else if (score >= 80 && score < 90) {
      System.out.println("The student's grade is B.");
    } else if (score >= 70 && score < 80) {
      System.out.println("The student's grade is C.");
    } else if (score >= 60 && score < 70) {
      System.out.println("The student's grade is D.");
    } else {
      System.out.println("The student's grade is F.");
    }
  }
}
