public class InsertionSort {
    public static int [] insertionSort(int []a){

        for(int i=1;i<a.length;i++){
            int temp=a[i];
            int j=i-1;
            while (j>=0 &&a[j]>temp){
                a[j+1]=a[j];
                j=j-1;

            }
            a[j+1]=temp;

        }
        return a;
    }
    public static void main(String[] args) {
        int []a={1,3,65,2,7,45,1,9,5};
        int []c=insertionSort(a);
        for(int d:c){System.out.print(d+" ");}


    }
}
