public class Narrowing {
    public static void main(String[] args) {
        //Narrowing
        int d = (short)4.8d;
        int d1 = (int)(short)(int)(float)(long)5.8d;

        char c = (char) 65; //Explicitly converting int to char
        byte b = (byte)(130);//type casted value will return
        System.out.println(d);
        System.out.println(d1);
        System.out.println(c);
        System.out.println(b);
    }
}