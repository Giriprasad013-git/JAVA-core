import java.util.Scanner;

public class PalindromeStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        String b="";
        for(int i=n.length()-1;i>=0;i--){
            b=b+n.charAt(i);
        }
        System.out.println(b);
        System.out.println(n);
        if(b.equals(n)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not an palindrome");
        }
        sc.close();
    }
}
