import java.util.Scanner;

public class upperorlovercase  {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a character: ");
    char c = scan.next().charAt(0);

    if (Character.isLowerCase(c)) {
      System.out.println("The character is lowercase.");
    } else if (Character.isUpperCase(c)) {
      System.out.println("The character is uppercase.");
    } else {
      System.out.println("The character is neither lowercase nor uppercase.");
    }
  }
}


