public class binarycount {
    public static void main(String[] args) {
        int n=8,count=0;
        while(n>0){
            count++;
            n=n>>1;
        }System.out.println(count);
    }
}
