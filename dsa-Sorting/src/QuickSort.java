public class QuickSort {
//    based on divide and conquer algorithm
    public static int partition(int []a,int low ,int high){
        int pivot=a[high];
        int i=low;
        int j=low;
        while (low<=high){
            if(a[i]<=pivot){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
            i++;
        }
        return j-1;
    }
    public static void sort(int a[],int low,int high){
        if(low<high){
            int p=partition(a,low,high);
            sort(a,low,p-1);
            sort(a,p+1,high);
        }
    }
public static void main(String[] args) {
    int []a={12,4,6,90,34,21,0,-2,4};
    int n=a.length-1;
        sort(a,0,n);
}
}
