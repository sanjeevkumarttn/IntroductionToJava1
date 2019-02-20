//  Q5. Find common elements between two arrays.

import java.util.Random;
import java.util.Scanner;

public class CommonElements {

    int[] arr1 = new int[10];
    int[] arr2 = new int[10];
    public void findCommon(){
        System.out.println("\n\nCommon Elements are:");
        for(int i = 0; i<arr1.length; i++ ) {
            for(int j = 0; j<arr2.length; j++) {
                if(arr1[i]==arr2[j]) {
                    System.out.print(arr2[j]+" ");
                }
            }
        }
    }

    public void displayArray(int[] arr){
        for(int i=0; i<10; i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        Random rand = new Random();
        CommonElements obj = new CommonElements();
        int i;
        for (i = 0; i < 10; i++) {
            obj.arr1[i] = rand.nextInt(100);

        }

        for (i = 0; i < 10; i++) {
            obj.arr2[i] = rand.nextInt(100);
        }
        System.out.println("Elements of 1st array:");
        obj.displayArray(obj.arr1);
        System.out.println("\n\nElements of 2nd array:");
        obj.displayArray(obj.arr2);
        obj.findCommon();
    }
}
