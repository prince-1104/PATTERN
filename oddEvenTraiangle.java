import java.util.*;
public class oddEventraingle{
    public static void tri(int n){
for(int i=1; i<=n; i++){
    //inner 
    for(int j=1; j<=i; j++){
        if((i+j)%2==0){      //even
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
    }
    System.out.println();
}
    }
    public static void main(String args[]){
        tri(5);
    }
    }
