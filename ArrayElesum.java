public class ArrayElesum{
    public static void main(String[] args){
        int F1[]={45,58,73,81,55};
        int F2[]={68,59,70,66,80};
        int f1sum=0,f2sum=0,i;
        i=F1.length;
        while(--i>=0){
            f1sum+=F1[i];
            f2sum+=F2[i];
        }
        if(f1sum>f2sum){
            System.out.println("The F1 got more marks of : "+f1sum);
        }else{
            System.out.println("The F2 got more marks of : "+f2sum);
        } 
    }
}