import java.io.;
import java.util.*;
 class alphabet
  {
   public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    char c=s.charAt(0);
    if(Character.isAlphabetic(c))
      {
      System.out.println("it is alphabet");
      }
    else
      {
      System.out.println("it is not alphabet");  
      }
    }
  }
   
