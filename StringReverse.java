public class StringReverse {
    public static void main(String[] args) {
        String str="Hello";
        StringBuilder str2=new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            str2.append(str.charAt(i));
        }System.out.println(str2);
    }
}
