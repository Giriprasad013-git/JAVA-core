import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = input.next();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
          if (Character.getNumericValue(number.charAt(i)) % 2 == 1) {
            result.append(number.charAt(i));
            if (i < number.length() - 1 &&
                Character.getNumericValue(number.charAt(i + 1)) % 2 == 1) {
              result.append("-");
            }
          }
        }
        System.out.println("Result: " + result.toString());
      }
}