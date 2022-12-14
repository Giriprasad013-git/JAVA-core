import java.util.Scanner;

public class NEWW {
    public static void main(String args[]){
        int n,o=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<=n;i++){
            o+=i;
        }
        System.out.println(o);
        sc.close();
    }
}
