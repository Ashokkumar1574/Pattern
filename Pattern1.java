  Pattern:

Input: 
6


Output:

1357911
13579
1357
135
13
1

code:

 import java.util.Scanner;
   public class Main{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=1;
    for(int i=n;i>=1;i--){
      for(int j=i;j>=1;j--){
        System.out.print(k);
        k+=2;
      }
      k=1;
      System.out.println();
    }
  }
}