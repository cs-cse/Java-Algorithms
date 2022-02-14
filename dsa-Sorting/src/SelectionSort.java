public class SelectionSort {
        public static void selectionSort(int []a){
                int n=a.length;
                for(int i=0;i<n-1;i++){
                    int min=i;
                    for(int j=i+1;j<n;j++){
                        if(a[j]<a[min]){
                            min=j;
                        }
                    }
                    int temp=a[min];
                    a[min]=a[i];
                    a[i]=temp;

                }
                for (int c:a){System.out.print(c+" ");}
            System.out.println();
        }

    public static void main(String[] args) {
            int []a={1,23,5,-3,2,100,3,6,8,78};
            selectionSort(a);
    }
}
