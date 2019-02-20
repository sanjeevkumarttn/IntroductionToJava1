//Write a program to print your Firstname,LastName & age using static block,
// static method & static variable respectively

public class StaticExample {
    static String fName;
    static String lName;
    static int age;

    static {
        fName = "Rohit";
        lName = "Verma";
        age = 22;
    }

    public static void display(){
        System.out.println("You are "+fName+" "+lName+" and your age is "+age+" years");
    }

    public static void main(String[] args) {
        display();
    }
}
