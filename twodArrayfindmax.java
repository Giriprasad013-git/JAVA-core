public class twodArrayfindmax {
    public static void main(String[] args) {
        int[][] arr = new int[][]{  {1,2,3},
                                    {4,10,6},
                                    {7,8,9}};
        int i=0,max=0;
        while(i<arr.length){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            i++;
        }System.out.println(max);
    }
}
