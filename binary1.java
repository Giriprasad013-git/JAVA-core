public class binary1 {
    public static void main(String args[]){
        int a=7,b=3,c,i=0,count=0;
        c=a*b;
        int k[]=new int[8];
        while(c>0){
            k[i++]=c%2;
            c=c/2;
        }
        for(int j=0;j<k.length;j++){
            if(k[j]==1){
                count++;
            }
        }
        System.out.println(count);
        for(int l=k.length-1;l>=0;l--){
            System.out.print(k[l]+"");
        }
    }
}
