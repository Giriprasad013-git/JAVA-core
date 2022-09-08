public class Return {
    public static void main(String[] args) {
        System.out.println("Main starts");
        System.out.println(alluArjun());
        System.out.println("Main ends");
    }
    public static int alluArjun(){
        System.out.println("dancing");
        return 10;
        // System.out.println("Hiii"); //Hii will not exicute it will stop and return it will not follow any condition after the return keyword 
        //Gives Unreachable code
    }
}
