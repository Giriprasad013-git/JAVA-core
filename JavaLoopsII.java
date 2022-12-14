//2
//0 2 10
//5 3 5

import java.io.*;
import java.util.*;
import java.lang.*;
public class JavaLoopsII {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt(); 
            int p=0;
            for(int j = 0;j<n;++j){
                p+=Math.pow(2,j)*b;
                int k = a+p;
                System.out.printf("%d ",k);
            }
           System.out.println();
        }
        
    }
}
//s0,s1,.....,sn-1: