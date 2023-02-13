import java.util.Scanner;

public class DaytoYMD {
  public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number of days: ");
    int days = scan.nextInt();

    int years = days / 365;
    int remainingDays = days % 365;
    int months = remainingDays / 30;
    remainingDays = remainingDays % 30;

    System.out.println(days + " days is equal to " + years + " years, " + months + " months, and " + remainingDays + " days.");
  }
}
