public class Finddatatype {
    public static void main(String[] args) {
        char ch='*';
        
        if((ch>='a' && ch<= 'z')||(ch>='A' && ch<='Z')){
            System.out.println("this is charector");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("this is number");
        }
        else{
            System.out.println("this is an Spesial charector");
        }
    }
}
