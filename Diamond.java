public class Diamond{
    public static void carbon(int n){
        for(int i=1; i<=n; i++){
            //1st Half
            //space 
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //star
            for(int j=0; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd Half
        for(int i=n; i>=1; i--){
                //space 
                for(int j=1; j<=n-i; j++){
                     System.out.print(" ");
                 }
             //star
         for(int j=0; j<=(2*i)-1; j++){
          System.out.print("*");
    }
             System.out.println();
                    }
        }
    //fumction call
    public static void main(String args[]){
        carbon(15);
    }
}