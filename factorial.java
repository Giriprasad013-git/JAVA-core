
    
import java.util.Scanner;

public class factorial {
    public static void main(String args[]){
        int n,o=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            o*=i;
        }
        System.out.println(o);
        sc.close();
    }
}
    