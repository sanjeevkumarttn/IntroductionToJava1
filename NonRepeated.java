//Q6. There is an array with every element repeated twice except one. Find that element

public class NonRepeated {

    public static void main(String[] args) {
        int[] array = {5,8,4,3,4,5,3,8,7,9,7,9,1};

        int res = array[0];
        for (int i = 1; i < array.length; i++)
            res = res ^ array[i];
        if(res != 0)
            System.out.println("The non-repeated element is: "+res);
        else
            System.out.println("There is no non-repeated element");
        
    }
}
