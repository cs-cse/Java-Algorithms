public class fibonacci {
    public static int recursiveFibonacci(int n){
        if(n<2){
            return n;
        }
        else{
            return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
        }


    }

    public static int iterativeFibonacci(int n){
        int fib=0;
        if(n<2){
            return n;
        }

        else{
            for(int i=2;i<n;i++){
                fib=i-1+i-2;
            }
        }
        return fib;
    }
    public static void main(String[] args) {
        System.out.println(recursiveFibonacci(15));
        System.out.println(iterativeFibonacci(15));
    }
}
