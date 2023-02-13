import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int result = 1;
        while (n1 > 0) {
            result *= n;
            n1--;
        }
        System.out.println(result);
    }
}
