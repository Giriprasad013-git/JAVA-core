/**
 * Spy
 */
public class Spy {

    public static void main(String[] args) {
        int sum=0;
        int mul=1;
        int rem;
        int n=123;
        while(n>0){
            rem=n%10;
            sum=sum+rem;
            mul=mul*rem;
            n=n/10;
        }
        if((sum==mul)){
            System.out.println("Spy number");
        }
        else{
            System.out.println("Not a spy number");
        }
    }
}