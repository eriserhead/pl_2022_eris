import java.util.Scanner;

public class Activity5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Expression:");
		String expression = scanner.nextLine();
		String[] parts = expression.split(" ");
		String type = parts[0];
		String name = parts[1];
		String value = parts[3];
		
		if (type.equals("int") && value.matches("[0-9]+")) {
			System.out.println("Semantically Correct!");
		} else if (type.equals("String") && value.startsWith("\"") && value.endsWith("\"")) {
			System.out.println("Semantically Correct!");
		} else if (type.equals("double") && value.matches("[0-9]+\\.?[0-9]+")) {
			System.out.println("Semantically Correct!");
		} else {
			System.out.println("Semantically Incorrect!");
		}
	}
}