import java.util.Scanner;

class Practice{
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Long x =sc.nextLong();
            System.out.println(x+" can be fitted in:");
            if(x>=-(Math.pow(2,16)) && x<=(Math.pow(2,16)-1)){
                System.out.println("* short");
            }
            
            if(x>=-(Math.pow(2,32)) && x<=(Math.pow(2,32)-1)){
                System.out.println("* int");
            }
            if(x>=-(Math.pow(2,64)) && x<=(Math.pow(2,64)-1)){
                System.out.println("* long");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(sc.next() + " can't be fitted anywhere.");
        }
    }
}
