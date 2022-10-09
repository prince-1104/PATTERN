public class NumPyramid{
    public static void pyramid(int n){
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){       //printed no is=i always            
                System.out.print(i+" ");
            } 
            System.out.println();      
         }
    }
    public static void main(String args[]){
        pyramid(5);
    }
}