public class Demo {
    //Stack overflow error
    static {
        System.out.println("Unknown3");
        Demo d1 = new Demo();
        System.out.println("Unknown2");
    }
    {
        System.out.println("Unknown");
    }
    public static void main(String[] args) {
        System.out.println("Start");
        Demo b2 = new Demo();
        System.out.println("end");
    }
}
