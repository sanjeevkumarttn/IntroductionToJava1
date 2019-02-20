// Q10.Write a single program for following operation using overloading
//  A) Adding 2 integer number
//  B) Adding 2 double
//  C) multiplying 2 float
//  D) multiplying 2 int
//  E) concate 2 string
//  F) Concate 3 String

public class MethodOverloading {

    public int add(int num1, int num2){
        return num1+num2;
    }

    public double add(double num1, double num2){
        return num1+num2;
    }

    public int multiply(int num1, int num2){
        return num1*num2;
    }

    public float multiply(float num1, float num2) {
        return num1 * num2;
    }

    public StringBuffer concate(String str1, String str2){
        StringBuffer sbuff = new StringBuffer();
        sbuff.append(str1);
        sbuff.append(str2);
        return sbuff;
    }

    public StringBuffer concate(String str1, String str2, String str3){
        StringBuffer sbuff = new StringBuffer();
        sbuff.append(str1);
        sbuff.append(str2);
        sbuff.append(str3);
        return sbuff;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println("Sum = "+obj.add(20,30));
        System.out.println("Sum = "+obj.add(234.90,56.87));
        System.out.println("Product = "+obj.multiply(12,23));
        System.out.println("Product = "+obj.multiply(12.50f,6.78f));
        String concateStr1 = (obj.concate("ABC","DEF")).toString();
        String concateStr2 = (obj.concate("ABC", "DEF", "GHI")).toString();
        System.out.println("After concating two string: "+concateStr1);
        System.out.println("After concating three string: "+concateStr2);
    }
}
