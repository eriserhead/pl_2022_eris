import java.util.Scanner;
public class Activity3 {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
       System.out.print("Enter Lexemes: ");
      String a =  input.nextLine(); 
        
  String split [] = a.split("");
  String data [] = { "String", "int", "char", "double" };
 
  int val = 0;
  String array[] = new String[5];
  int x = 0;
  String DATA = "<data_type>";
  for (String string : split) {

      if (string.contains(data[0])) {
          array[x] = DATA;

      } else if (string.contains(data[1])) {
          array[x] = DATA;

      } else if (string.contains(data[2])) {
          array[x] = DATA;

      } else if (string.contains(data[3])) {
          array[x] = DATA;

      } else if (string.contains("=")) {
          array[x + 2] = "<assignment_operator>";

      } else if (string.contains(";")) {
          if (val == 0 && string.contains("\"") || string.contains(";")
                  || string.contains("'")) {
              array[x + 3] = "<value>";
              array[x + 4] = "<delimiter>";

          } else if (string.contains(";")) {
              array[x + 4] = "<delimiter>";

          }
      } else if (val == 0 && string.contains("\"") || string.contains("'")) {
          val++;
          array[x + 3] = "<value>";

      } else {
          array[x + 1] = "<identifier>";
      }

  }
  input.close();
  for (String string : array) {
     System.out.println(string);
  }
}
}

    

