public class butterfly{
    public static void fly(int n){
        //1st Half
        for(int i=1; i<=n; i++){
            //star-i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space-2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //star-i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();  //nextLine
        }
        //2nd Half (mirror of 1st Half)
        for(int i=n; i>=1; i--){
            //star-i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space-2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //star-i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();  //nextLine
        }
    
        }
        //function call
        public static void main(String args[]){
            fly(7);
        }
    }
