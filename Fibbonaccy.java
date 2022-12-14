public class Fibbonaccy {
    public static void main(String[] args) {
        int n=10,a=0,b=1,c=0;
        for(int i=0;i<n;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}