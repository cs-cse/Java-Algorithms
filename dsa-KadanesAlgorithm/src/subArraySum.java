public class subArraySum {
    public static int maxSubArray(int arr[]){
        int maxSoFar=arr[0];
        int currentMax=arr[0];
        for(int i=1;i<arr.length;i++){
            currentMax=currentMax+arr[i];
            if(currentMax<arr[i]){
                currentMax=arr[i];
            }
            if(maxSoFar<currentMax){
                maxSoFar=currentMax;
            }
        }
        return maxSoFar;
    }


    public static void main(String[] args) {
        int a[]={4,3,-2,5,6,-12,7,-1,6,5};
        int c=maxSubArray(a);
        System.out.println("Maximum sum: "+c);

    }
}
