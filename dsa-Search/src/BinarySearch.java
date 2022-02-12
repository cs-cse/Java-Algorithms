public class BinarySearch {
    public static int binarySearch(int []a,int x){
        int n=a.length-1;
        int low=0;
        while (low<=n){
            int mid=(low+n)/2;
            if(x==mid){
                return mid;
            }
            if(x>mid){
                low=mid+1;
            }
            else{
                n=mid-1;
            }
        }
    return -1;
    }
    public static int searchInsert(int []a,int x){
        int n=a.length-1;
        int low=0;
        while (low<=n){
            int mid=low+(n-low)/2;
            if(x==mid){
                return mid;
            }
            if(x>mid){
                low=mid+1;
            }
            else{
                n=mid-1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,10};
        int b[]={1,5,7,89,3,2,6,3,2,9};
       int c= binarySearch(a,6);
       int d=searchInsert(a,9);

        System.out.println(d);

    }

}
