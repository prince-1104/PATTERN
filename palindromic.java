public class palindromic{
    public static void palindromicNum(int n){
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //descending
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //ascending
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    //call
    public static void main(String args[]){
        palindromicNum(5);
    }
}