Input: 
7

Output:
2
23
235
2357
235711
23571113
2357111317

CODE:

import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
     int num=2;
    for(int i=1;i<=rows;i++){
      int count=0;
      while(count<i){
        if(isPrime(num)){
          System.out.print(num);
          count++;
        }
        num++;
      }
      System.out.println();
    }
  }
  static boolean isPrime(int num){
    if(num<2){
      return false;
    }
    for(int i=2;i<=Math.sqrt(num);i++){
      if(num%i==0){
        return false;
      }
    }
    return true;
  }
}
