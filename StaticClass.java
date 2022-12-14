public class StaticClass {
    static int a=120;//anywere and anyone can change
    public static void main(String[] args) {
        //first preparence for local veriables
        a=1234;
        int a=20;
        a=45;
        StaticClass.a=100;
        a=500;
        System.out.println(a);
        System.out.println(StaticClass.a);//forcely calling outside member
        StaticClass.a=324;
        m1();
        System.out.println(a);
        StaticClass.a=700;
    }

    public static void m1(){
        a=123;
        System.out.println(a);
        int a=321;
        System.out.println(StaticClass.a);
        System.out.println(a);
        StaticClass.a=420;
        a=300;
        System.out.println(StaticClass.a);
        StaticClass.a=200;
        System.out.println(a);
    }
}
