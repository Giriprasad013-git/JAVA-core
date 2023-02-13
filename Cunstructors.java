import java.beans.Customizer;

public class Cunstructors {   
    public static void main(String[] args) { 
        Bhai c1=new Bhai();
        Bhai c2=new Bhai("Hello Bhai","Hi Bhai");
        String B="Hiii";
        System.out.println(c1.B+"  c1  "+c1.hi);
        System.out.println(c2.B+" c2 "+c2.hi);
    }
}
class Bhai{
    public static String hi = "Hellooo";
    public String B;
    Bhai(){
        System.out.println("Broooo!!");
    }
    Bhai(String hi,String B){
        this.B=B;
    }
}