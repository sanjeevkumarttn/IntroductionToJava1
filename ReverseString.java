// Write a program to reverse a string and remove character from index 4 to index 9 from the
// reversed string using String Buffer

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        StringBuilder input = new StringBuilder();

        input.append(str);
        input = input.reverse();
        System.out.println("After reversing string is:\n"+input);
        input = input.delete(4,9);
        System.out.println("After removing character from index 4 to index 9 string is:\n"+input);
    }
}
