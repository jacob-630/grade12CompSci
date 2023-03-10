package day06;

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
        System.out.println("savings: "+this.savings + " " + "chequings: " + this.chequings);
    }
    //overload function for accounts, used for when credit is added
    accounts(float savings, float chequings, float credit){
        this.savings = savings;
        this.chequings = chequings;
        this.credit = credit;
        System.out.println("savings: "+this.savings + " " + "chequings:" + this.chequings + "credit: "+this.credit);
    }

    //FUNCTIONS TO CHANGE ACCOUNTS



    //deposit into savings
    public static  void savingsDepo(float amt){
        savings+=amt;
        System.out.println("savings: "+savings);
    }
    //deposit into cequings
    public static void chequingsDepo(float amt){
        chequings+=amt;
        System.out.println("chequings: "+chequings);
    }
    //withdraw from savings
    public static void savingsWith(float amt){
        //check that the requested amount is less than the account balance
        if(savings > amt)
            {savings-=amt;
            System.out.println("savings: "+savings);
        }
        else{
            System.out.println("Insifficent funds in the selected account.");
        }
    }
    //withdraw from chequings
    public static void chequingWith(float amt){
        //check that the requested amount is less than the account balance
        if(chequings > amt)
        {savings-=amt;
        System.out.println("chequings: "+chequings);
    }
    else{
        System.out.println("Insifficent funds in the selected account.");
    }
    }


    //check how much credit the account holder is eligible for
    public static float credit(){
            float total = (chequings + savings)/2;
            System.out.println("you are approved for credit up to $"+total);
            return total;
        
    }




    public static void trnsfr(int s, float amt){
        //1 Refers to Chequings to Savings
        if(s == 1){
            //Check that they have the requested balance
            if(chequings >= amt){
            //Move 'amt' from chequings to savings
                chequings -= amt;
                savings += amt;
                System.out.println("savings balance: $"+savings+" chequings balance: $"+chequings);
            }
            else{
                System.out.println("you do not have $"+amt+" in your chequings account");
            }
        }
        //2 refers to Savings to Chequings
        else if(s == 2){
            //Move 'amt' from savings to chequings
            //Check that they have the requested balance
            if(savings >= amt){
                //Move 'amt' from savings to chequings
                    chequings += amt;
                    savings -= amt;
                    System.out.println("savings balance: $"+savings+" chequings balance: $"+chequings);
                }
                else{
                    System.out.println("you do not have $"+amt+" in your savings account");
                }
        }
    }
}


