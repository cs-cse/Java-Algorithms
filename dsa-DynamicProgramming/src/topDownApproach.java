public class topDownApproach {
//  a large problem is broken down into smaller problems and each solution
//  to sub problems are remembered and used directly w/o recomputing, this is also called Memoization

    public static int fib(int []memo,int n){
        if(memo[n]==0){
            if(n<2){
                memo[n]=n;
            }else{
                int left=fib(memo,n-1);
                int right=fib(memo,n-2);
                memo[n]=left+right;
            }
        }
        return memo[n];
    }

    public static void main(String[] args) {
        int n=15;
        int []memo=new int[n+1];
        int c=fib(memo,n);
        System.out.println(c);
    }
}
