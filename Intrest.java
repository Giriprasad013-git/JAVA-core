public class Intrest {
    public static void main(String[] args) {
        double P=20000;
        double T=4;
        double R=0.2;
        double CompoundIntrest=P * Math.pow(1+R, T)-P; 
        double SimpleIntrest=(P*T*R)/100;
        System.out.println(SimpleIntrest);
        System.out.println(CompoundIntrest);

    }
}
//A =[P (1 + i)^n] – P