// Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?

import java.util.Scanner;

public class CountDuplicateWord {

    public static void main(String[] args) {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");
        for(int i=0; i<words.length; i++){
            for(int j=i+1; j<words.length; j++){
                if(words[i].equals(words[j])){
                    count++;
                    words[j]="0";
                }
            }
            if(words[i]!="0"){
                System.out.println(words[i]+"--"+count);
            }
            count=1;
        }

    }

}

