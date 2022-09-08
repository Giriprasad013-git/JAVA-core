public class ABCDriver {
    static int a;
    static {
        System.out.println("Hi java");
    }
    public static void main(String args[]){
        int a=10;
        System.out.println(ABC.a+ABC.b);
        System.out.println(a);
    }
    static{
        System.out.println(ABCDriver.a);
    }
}
