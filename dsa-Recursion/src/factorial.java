public class factorial {
    public static int recursiveFactorial(int n){
            if(n==2){
                return 2;
            }
            return n * recursiveFactorial(n - 1);

    }

    public static int iterativeFactorial(int n){
        int fact=1;
        while(n>0){
            fact=fact*n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(5));
        System.out.println(iterativeFactorial(5));
    }
}
