public class QuickSortDriver {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partetion(int arr[],int low,int high){
        int pivot=arr[high];
        int i=(low-1);
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }swap(arr,i+1,high);
        return (i+1);
    }
    static void QuickSort(int arr[],int low,int high){
        if(low<high){
            int pi = partetion(arr,low,high);
            QuickSort(arr,low,pi-1);
            QuickSort(arr,pi+1,high);
        }
    }
    static void Print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={50,40,30,20,10};
        int n=arr.length;
        QuickSort(arr,0,n-1);
        Print(arr);
    }
}
