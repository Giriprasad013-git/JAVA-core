import java.util.Scanner;


public class PalindromeInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        int sum=0;
        int temp=num;
        int ss=0;
        while(num>0){
            rev=num%10;
            sum=(sum*10)+rev;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}
