public class XylonFloam {
    public static void main(String[] args) {
        int n=1234;
        int k=n,ls,ms=0;
        int f=n,s=0;
        int digits=0;
        while(n>0){
            digits++;
            n=n/10;
        }
        int i=0,j=digits;
        while(j>0){
            i=k%10;
            k=k/10;
            j--;
        }
        ls=(f%10)+i;
        System.out.println(ls);
        j=digits;
        for(i=0;i<j/2;i++){
            f=f/10;
            s=f%10;
            ms=ms+s;
        }
        System.out.println(ms);
        if(ms==ls){
            System.out.println("Xylon");
        }else{
            System.out.println("phloam");
        }
    }
}
