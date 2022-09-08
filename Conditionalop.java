public class Conditionalop {
    public static void main(String[] args) {
        int a=3,b=50,c=6;
        // System.out.println(((a%2)==0)?"Even":"Odd");//(a)?b:c
        // System.out.println((a>b)?"a is Bigger":"b is Bigger");//(a)?b:c
        // System.out.println((a<b)?"a is Smaller":"a is Smaller");//(a)?b:c
        // System.out.println(((a>b)?"a is Bigger":"a is Smaller"));//(a)?b:c
        System.out.println(a>b?(a>c?"a is Bigger":"c is Bigger"):(b>c?"b is Bigger":"c is Bigger"));
    }
}
