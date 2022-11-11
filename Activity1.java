import java.util.Scanner;
public class Activity1 {
    
    public static void main(String[] args) {
  Scanner input  = new Scanner(System.in);
  System.out.println("PALINDROME CHECKER");
    System.out.print("Type a word: ");
      String str;
      str = input.nextLine();
      String reverseStr = "";
      
      int strLength = str.length();
  
      for (int i = (strLength - 1); i >=0; --i) {
        reverseStr = reverseStr + str.charAt(i);
      }
  
      if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
        System.out.println(str + " is a Palindrome String.");
      }
      else {
        System.out.println(str + " is not a Palindrome String.");
      }
      input.close();
    }
  }
