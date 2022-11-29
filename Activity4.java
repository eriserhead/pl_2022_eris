import java.util.Scanner;
public class Activity4 {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     
     System.out.print("Enter Tokens: ");
     String a = sc.nextLine();
     sc.close();

     String b = "<data_type> <identifier> <assignment_operator> <value> <delimiter>";

     if (a.equals(b)){

        System.out.println("Syntax is Correct!");
     }
     else {

        System.out.println("Syntax is Error!"); 
     }

    }
}
