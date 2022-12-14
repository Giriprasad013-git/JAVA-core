public class ABC {
    static int a=30;
    static {
        int a=110;
        System.out.println("afternoon");
        System.out.println(ABC.a);
    }
    static int b=40;
    static {
        int a=ABC.a+ABC.b+10;
        int b=120;
        System.out.println(",C");
        a=445;
        System.out.println(b);
    }
    public static void m1(){
        System.out.println(a);
        int a=120;
        System.out.println("Java");
        ABC.a=20;
        b=20;
    }
}
