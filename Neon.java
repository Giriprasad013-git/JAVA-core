// A neon number is a number where the sum of digits of square of the 
// number is equal to the number.
public class Neon {
    public static void main(String[] args) {
        int a=1;
        int sqr=a*a,x,sum=0;
        while(sqr>0){
            x=sqr%10;
            sum=sum+x;
            sqr=sqr/10;
        }
        if(a==sum)
            System.out.println("Neon");
        else
            System.out.println("Not Neon"); 
    }
}
