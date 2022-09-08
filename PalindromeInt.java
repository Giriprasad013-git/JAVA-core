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
            System.out.println(rev);
            if(rev%2==0){
                ss+=rev;
            }
            sum=(sum*10)+rev;
            num=num/10;
        }
        System.out.println("The Even num sum is "+ss);
        if(temp==sum){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}
