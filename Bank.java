//  Q11.Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails
// which provide there specific details like rateofinterest etc,print details of every banks

public class Bank {
    int rateOfInterest;


    Bank(int interest){
        this.rateOfInterest = interest;

    }

    public void getDetails(){
        //System.out.println("Bank Name: "+this.name+"  Rate of Interest: "+this.rateOfInterest);
    }
}

class SBI extends Bank{

    SBI(int i)   {
        super(i);
    }


    public void getDetails(){
        System.out.println("\n----Welcome to SBI Bank-----");
        System.out.println("Rate of Interest: "+rateOfInterest);
    }
}

class BOI extends Bank{

    BOI(int i)   {
        super(i);
    }


    public void getDetails(){
        System.out.println("\n----Welcome to BOI Bank-----");
        System.out.println("Rate of Interest: "+rateOfInterest);
    }
}

class ICICI extends Bank{

    ICICI(int i)   {
        super(i);
    }


    public void getDetails(){
        System.out.println("\n----Welcome to ICICI Bank-----");
        System.out.println("Rate of Interest: "+rateOfInterest);
    }
}

class BankMain{

    public static void main(String[] args) {

        Bank bank;
        bank = new SBI(12);
        bank.getDetails();
        bank = new BOI(10);
        bank.getDetails();
        bank = new ICICI(11);
        bank.getDetails();
    }
}