/**
 * Created by Hanna_Zhahala on 07.02.2017.
 */
import java.util.Scanner;
public class StringPalindrome {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("YOUR STRING is: ");
        String a = in.nextLine();

        String reversedString = new StringBuffer(a).reverse().toString();
        System.out.println(reversedString);
        System.out.println("THE REVERSED " +
                "STRING IS: " + reversedString);



        if (a.equals(reversedString))
            System.out.println("THIS IS A PALINDROME STRING");
        else
            System.out.println("THIS IS NOT A PALINDROME STRING");
    }
}


