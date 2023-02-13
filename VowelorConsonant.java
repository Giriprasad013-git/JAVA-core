public class VowelorConsonant {
    public static void main(String[] args) {
        String str="b";
        str =str.toLowerCase();
        if(str.charAt(0)=='a' || str.charAt(0)=='e' || str.charAt(0)=='i' || str.charAt(0)=='o' || str.charAt(0)=='u'){
            System.out.println(str.charAt(0)+" <-- is a vowel");
        }else{
            System.out.println(str.charAt(0)+" <-- is a consonant");
        }
    }
}


// for(int i=0;i<str.length();i++){
//     if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
//         System.out.print(str.charAt(i)+" ");
//     }
// }