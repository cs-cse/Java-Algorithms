public class LinearSearch {
    public static int  search(int []a,int n,int x){
        for(int i=0;i<n;i++){
            if(a[i]==x){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []a={1,2,3,4,5,8,5,7,0,12};
       int c= search(a,7,8);
        System.out.println(c);
    }
}
