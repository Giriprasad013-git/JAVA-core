public class LeafYear {
    public static void main(String[] args) {
        int year=2022;
        if(((year%4==0) && (year%100!=0))||(year%400==0)){
            System.out.println("This is an leaf year");
        }
        else{
            System.out.println("this is Not an leaf year");
        }
    }    
}
