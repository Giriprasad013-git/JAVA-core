public class revarseNum {
    public static void main(String[] args) {
        int num=1234;
        String str="";
        while(num>0){
            int rem = num%10;
            str=str+rem;
            num/=10;
        }        
        System.out.println(str);  
    }
}
