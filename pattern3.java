Input: 
5
Output:
a
ab
abc
abcd
abcde

CODE:

import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    for(int i=1;i<=num;i++){
      for(char ch='a';ch<='a'+i-1;ch++){
        System.out.print(ch);
      }
      System.out.println();
    }
  }
}