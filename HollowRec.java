public class HollowRec{   //program to print hollow rectangle
  //function
  public static void hollow_rect(int totRows, int totCols){
    for(int i=1; i<=totRows; i++){
        for(int j=1; j<=totCols; j++){
            if(i==1 || i==totRows || j==1 || j==totCols){  //boundary
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println(); //next line
    }
  }
  public static void main(String args[]){
   
    hollow_rect(5, 8);

  }
}