import java.io.*;
import java.util.*;
class vowels
 {
  public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      String s=sc.next();
      s=s.toLowerCase();
      char c=s.charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'==c=='u')
         {System.out.println("It is vowel");
         }
        else
         {
          System.out.println("It is consonant");
         }
    } 
 }
    
 
