import java.util.ArrayList;

public class StringReplace {
    public static void main(String args[]){
        String st="99263";
        int rem,l=0,temp=0,k=Integer.parseInt(st);
        ArrayList arr=new ArrayList<>();
        for(int i=0;i<st.length();i++){
            rem=k%10;
            k=k/10;
            arr.add(rem);
        }
        System.out.println(arr);
        for(int i=0;i<arr.size();i++){
            int j=i+1;
            if((arr.indexOf(i)%2!=0) && (arr.indexOf(j)%2!=0)){
                System.out.println("hi");
                arr.add('-');
            }
        }
        System.out.println(arr);
    }
}
//Infinite loop