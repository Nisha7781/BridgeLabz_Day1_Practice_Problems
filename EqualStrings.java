import java.util.*;

class EqualStrings 
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter first String: ");
      String str1 = sc.nextLine();
      System.out.println("Enter second String: ");
      String str2 = sc.nextLine();

      if(str1.equals(str2))
      {
         System.out.println("strings are equal.");
      }
      else
      {
         System.out.println("Strings are not equal.");
      }
    }
}
