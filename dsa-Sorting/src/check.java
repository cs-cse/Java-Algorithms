import java.util.Arrays;
class check {
    public static void main(String[] args) {
        int []a={2,65,34,7,8,1};
        char b[]={'a','v','e','x','u','7','1',};
        Arrays.sort(a);
       Arrays.sort(b);
        long start=System.currentTimeMillis();
       for (int i:a){

           System.out.print(i+" ");
       }
        long end=System.currentTimeMillis();
        System.out.println();
        long start1=System.currentTimeMillis();
        for (char c:b){
            System.out.print(c+" ");
        }
        long end1=System.currentTimeMillis();
        System.out.println();
        System.out.println("Time taken: ");
        System.out.println("Integers: "+(end-start));
        System.out.println("Characters: "+(end1-start1));
    }
}