import java.util.*;

public class Activity2 {

    public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT STRING: ");
        String input = sc.nextLine();

        int state = 0;

        for (int i = 0; i < input.length(); i++)

        {

            if (state == 0 && input.charAt(i) == 'a')

                state = 1;

            else if (state == 0 && input.charAt(i) == 'b')

                state = 2;

            else if (state == 1 && input.charAt(i) == 'a')

                state = 1;

            else if (state == 1 && input.charAt(i) == 'b')

                state = 2;

            else if (state == 2 && input.charAt(i) == 'a')

                state = 1;

            else if (state == 2 && input.charAt(i) == 'b')

                state = 2;

            else

            {

                state = -1;

                break;

            }

        }

        if (state == 1)

            System.out.println("Accepted");

        else

            System.out.println("Rejected");

    }

}