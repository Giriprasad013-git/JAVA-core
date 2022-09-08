import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,rem,mul=1,sum=0;
        int temp=n;
        int temp2=n;
        while(n>0){
            count++;
            n=n/10;
        }
        while(temp>0){
            rem=temp%10;
            for(int i=0;i<count;i++){
                mul=mul*rem;
            }
            sum+=mul;
            mul=1;
            temp=temp/10;
        }
        if(temp2==sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("its not an Armstrong number");
        }
    }
}
