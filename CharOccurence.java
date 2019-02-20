// Q3. Write a program to find the number of occurrences of a character in a string without using loop?

import java.util.Scanner;

public class CharOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        System.out.println("Enter Chracter to be count: ");
        char tocount = sc.next().charAt(0);


        int strLen = str.length();
        String strReplace = str.replaceAll(String.valueOf(tocount), "");
        int strReplaceLen = strReplace.length();
        int replaceCharLen = strLen - strReplaceLen;
        System.out.println("Occurence of character "+tocount+" is: "+replaceCharLen);
    }
}
