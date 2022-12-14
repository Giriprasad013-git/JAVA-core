import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long i=sc.nextInt();
        do {
            System.out.println("Hello Giri for "+i+" Times");
            i--;
        } while (i>=0);
        sc.close();
    }
}
