import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean exit=true;
        while(exit){
           
            
            System.out.println("Enter the choice\n1)ADD\n2)SUB\n3)MUL\n4)DIV\n5)ModDiv\n6)EXIT\n");
            int ch=sc.nextInt();
            System.out.println("Enter the a and b value\n");
            int a=sc.nextInt(),b=sc.nextInt();
            
            switch (ch) {
                case 1: Add(a, b);break;
                case 2: Sub(a, b);break;
                case 3: Mul(a, b);break;
                case 4: Div(a, b);break;
                case 5: ModDiv(a, b);break;
                case 6: {
                    while(exit){
                        exit=true;
                        System.out.println("Enter y/Y to Exit");
                        char c=sc.next().charAt(0);
                        if(c == 'y' || c=='Y'){
                            exit=false;
                        }   
                        if(c == 'n' || c=='N'){
                            System.out.println("You ar still logged in");
                        }   
                    }
                    break;
                }
                default:System.out.println("Sahi se option Choice karna");
                    break;
            }
        }
    }
    public static void Add(int a,int b){
        System.out.println(a+b);
    } public static void Mul(int a,int b){
        System.out.println(a*b);
    } public static void Div(int a,int b){
        float c=(float)a;
        float d=(float)b;
        System.out.println((c/d));
    } public static void Sub(int a,int b){
        System.out.println(a-b);
    } public static void ModDiv(int a,int b){
        double c=(double)a;
        double d=(double)b;
        System.out.println((c%d));
    } 
}
