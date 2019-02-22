//  Q4. Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters
// In A String


import java.util.Scanner;

public class NumberAndPercentageOfLetters {

    int digitCount = 0;
    int lowercaseCount = 0;
    int uppercaseCount = 0;
    int othersCount = 0;
    String str;

    NumberAndPercentageOfLetters(String s){
        str = s;
    }

    public void countOccurrences(){

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= 48 && str.charAt(i) <= 57)
                digitCount++;
            else if(str.charAt(i) >= 65 && str.charAt(i) <= 90)
                uppercaseCount++;
            else if(str.charAt(i) >= 97 && str.charAt(i) <= 122)
                lowercaseCount++;
            else
                othersCount++;
        }
    }

    public void displayCount(){
        System.out.println("Total Lowercase Letters are: "+lowercaseCount+" and Percentage is: "+lowercaseCount * 100.0 / str.length()+" %");
        System.out.println("Total Uppercase Letters: "+uppercaseCount+" and Percentage is: "+uppercaseCount * 100.0 / str.length()+" %");
        System.out.println("Total Digits are: "+digitCount+" and Percentage is: "+digitCount * 100.0 / str.length()+" %");
        System.out.println("Others are: "+othersCount+" and Percentage is: "+othersCount * 100.0 / str.length()+" %");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        NumberAndPercentageOfLetters obj = new NumberAndPercentageOfLetters(str);
        obj.countOccurrences();
        obj.displayCount();
    }

}
