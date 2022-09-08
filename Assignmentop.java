public class Assignmentop {
    public static void main(String[] args) {
        int a=10,b,c; //  =
        a+=20;//  +=
        System.out.println(a);
        a-=10;//  -=
        System.out.println(a);
        a*=10;//  *=
        System.out.println(a);
        a/=10;//  /=
        System.out.println(a);
        a%=10;//  %=
        System.out.println(a);
        a=2;
        b=4;
        System.out.println(a+=b-=a*=a%=10);
        a=10;
        b=20;
        c=5;
        System.out.println();
        a+=b-=c*=a%=b/=10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();
        a=10;
        b=20;
        c=5;
        a-=b+=c*=c/=a+=20;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
