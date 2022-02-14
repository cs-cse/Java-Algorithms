public class MergeSort {
//    It is based on divide and conquer algorithm.
    public static void sort(int []a,int []temp,int low,int high){
        int mid=low+(high-low)/2;
        sort(a,temp,low,mid);
        sort(a,temp,mid+1,high);
        merge(a,temp,low,mid,high);
    }
    public static void merge(int[] a, int[] temp, int low, int mid, int high){
        for(int i=low;i<=high;i++){
            temp[i]=a[i];
        }
        int i=low;int j=mid+1;int k=low;
        while (i<=mid&&j<=high){
            if(temp[i]<=temp[j]){
                a[k]=temp[i];
                i++;
            }
            else {
                a[k]=temp[j];
                j++;
            }
            k++;
        }
        while (i<=mid){
            a[k]=temp[i];
            i++;
            k++;
        }

    }
    public static void main(String[] args) {
        int []a={2,10,5,3,6,4,11};



    }
}
