public class BubbleSort {
    public static int[] bubbleSort(int[]a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j< a.length-1-i;j++){
            if(a[j]>a[j+1]){
                int temp=a[j+1];
                a[j+1]=a[j];
                a[j]=temp;
            }
          }
        }
        return a;
    }

    public static void main(String[] args) {
     int []a={2,6,8,2,1,8,0,230,31};
     int []c=bubbleSort(a);
     for(int d:c) {System.out.print(d + " ");}

    }
}
