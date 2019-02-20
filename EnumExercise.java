//  Q9.Write a program to display values of enums using a constructor & getPrice() method
// (Example display house & their prices)

public class EnumExercise {
    enum House{
        HOUSE1(200000), HOUSE2(300000), HOUSE3(400000);
        int price;

        House(int price) {
            this.price = price;
            //System.out.println("In Constructor");
            System.out.println("Name: "+this.name()+"  Price: "+this.price);
        }

        public int getPrice(){ return this.price; }
    }

    public static void main(String[] args) {
        System.out.println("Using Constructor\n");
        House[] Houses = House.values();
        System.out.println("\nUsing getPrice()\n");
        for (House h : Houses)
            System.out.println("Name: " + h.name() +"  Price: " + h.getPrice());
    }
}
