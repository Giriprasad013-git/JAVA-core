class DemoP {
    void test1() {
        System.out.println("parent");
    }
}

class DemoC extends DemoP {
    void test() {
        System.out.println("child");
    }
}

public class UpDntypecasting {

    public static void main(String[] args) {
        // Upcasting
        DemoP obj = new DemoC();
        obj.test1();

        // Downcasting
        DemoP P = new DemoC();
        DemoC C = (DemoC) P;
        P.test1();
        C.test();
    }
}
