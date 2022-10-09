
public class floydsTriangle{
public static void flTri(int n){
    int counter = 1;
    for(int i=1; i<=n; i++){ //outer loop
        //inner loop
        for(int j=1; j<=i; j++){
            System.out.print(counter+ " ");
            counter++;
        }
        System.out.println();
    }
}
//function call
public static void main(String args[]){
    flTri(5);
}
   
}