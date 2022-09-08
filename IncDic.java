public class IncDic {
    public static void main(String[] args) {
        
        int b=20,a=10;
        // c= a + b++ + c-- + --c + ++b + --a + a;//56
        // System.out.println(++a);//57
        // System.out.println(b++);//57
        // System.out.println(a--);//58
        // System.out.println(a);
        // System.out.println(b++);
        // System.out.println(b);
        // System.out.println(c);

        // c = a + --b + ++c + --c + --b + ++a + a--;//56
        // a = a-- + a++ + --b + c;
        // b = b-- + --c;

        // System.out.println(++c);//57
        // System.out.println(a++);//57
        // System.out.println(--b);//58
        // System.out.println(c--);
        // System.out.println(--a);
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        boolean c = (a++ > b) && (a++ < b);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);

        boolean d= (a++ > b) && (a++ < b);
        System.out.println(d);
        System.out.println(a);
        System.out.println(b);
        
    }
}
