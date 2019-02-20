//Q1. Write a program to replace a substring inside a string with other string ?

import java.util.Scanner;

public class ReplaceSubstring {
    String str;
    String toReplace;
    String withreplace;

    public ReplaceSubstring(String s1, String s2, String s3 ){
        str = s1;
        toReplace = s2;
        withreplace = s3;
    }

    public void replaceStr(){
        if(toReplace.isEmpty()){
            System.out.println("String after replace: "+str);
            System.exit(0);
        }
        if(str.contains(toReplace)){
            String replaceString=str.replaceAll(toReplace,withreplace);
            System.out.println("String after replace: "+replaceString);
        }else{
            System.out.println("Not any match for '"+toReplace+"' in string '"+str+"'");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s1 = scan.nextLine();
        System.out.print("Enter the Sub-String to be replace: ");
        String s2 = scan.nextLine();
        System.out.print("Enter the Sub-String with replace: ");
        String s3 = scan.nextLine();
        ReplaceSubstring obj = new ReplaceSubstring(s1, s2, s3);
        obj.replaceStr();
    }

}
