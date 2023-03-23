package day08;

public class accounts {
    public static float savings;
    public static float chequings;
    public static float credit;

    
//Initalize the constructor for the accounts
    accounts(){}

    //basic accounts model
    accounts(float savings, float chequings){
        this.savings = savings;
        this.chequings = chequings;
        System.out.println("savings: $"+this.savings + " " + "chequings: $" + this.chequings);
    }
    //overload function for accounts, used for when credit is added
    accounts(float savings, float chequings, float credit){
        this.savings = savings;
        this.chequings = chequings;
        this.credit = credit;
        System.out.println("savings: $"+this.savings + " " + "chequings: $" + this.chequings + " credit: $"+this.credit);
    }

    //FUNCTIONS TO CHANGE ACCOUNTS ARE KEPT IN THE ACCOUNTCHANGES CLASS



   
}


