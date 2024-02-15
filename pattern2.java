Input: 
5
Output:

    5
   45
  345
 2345
12345

code:

 import java.util.Scanner;
 public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n;
    n=sc.nextInt();
    for(int i=n;i>=1;i--){
      for(int k=1;k<i;k++){
        System.out.print(" ");
      }
      for(int j=i;j<=n;j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}