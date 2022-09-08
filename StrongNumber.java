public class StrongNumber {
    public static void main(String[] args) {
        int s=145;
        int fact=1;
        int i=0;
        int sum=0;
        int temp=s;
        int rem;
        while(s>0){
            rem=s%10;
            for(int j=1;j<=rem;j++){
                 fact*=j;
            }
            System.out.println(fact);
            sum+=fact;
            fact=1;
            s=s/10;
        }
        if(sum==temp){
            System.out.println("Strong number "+sum);
        }
    }
}
