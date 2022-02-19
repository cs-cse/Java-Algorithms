public class bottomUpApproach {
//    smaller problems are solved that build up and these sub problems help in
//    solving the main problem, also called the Tabulation Method
    public static int fib(int n){
        int []table=new int[n+1];
        table[0]=0;
        table[1]=1;
        for(int i=2;i<=n;i++){
            table[i]=table[i-1]+table[i-2];
        }
        return table[n];

    }
public static void main(String[] args) {
    int c=fib(15);
    System.out.println(c);
}

}
