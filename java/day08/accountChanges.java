package day08;

public class accountChanges {
    //check balances
    public static void checkBalancs(){
        if(accounts.credit > 0){
            System.out.println("your savings balance is $"+accounts.savings+" your chequings balance is $"+accounts.chequings+
            " your credit amount is $"+accounts.credit);
        }
        else{
            System.out.println("your savings balance is $"+accounts.savings+" your chequings balance is $"+accounts.chequings);
        }
    }

     //deposit into savings
     public static  void savingsDepo(float amt){
        accounts.savings+=amt;
        System.out.println("savings: "+accounts.savings);
    }
    //deposit into cequings
    public static void chequingsDepo(float amt){
        accounts.chequings+=amt;
        System.out.println("chequings: "+accounts.chequings);
    }
    //withdraw from savings
    public static void savingsWith(float amt){
        //check that the requested amount is less than the account balance
        if(accounts.savings > amt)
            {accounts.savings-=amt;
            System.out.println("savings: "+accounts.savings);
        }
        else{
            System.out.println("Insifficent funds in the selected account.");
        }
    }
    //withdraw from chequings
    public static void chequingWith(float amt){
        //check that the requested amount is less than the account balance
        if(accounts.chequings > amt)
        {accounts.savings-=amt;
        System.out.println("chequings: "+accounts.chequings);
    }
    else{
        System.out.println("Insifficent funds in the selected account.");
    }
    }


    //check how much credit the account holder is eligible for
    public static float credit(){
            final float total = (accounts.chequings + accounts.savings)/2;
            System.out.println("you are approved for credit up to $"+total);
            return total;
        
    }




    public static void trnsfr(int s, float amt){
        //1 Refers to Chequings to Savings
        if(s == 1){
            //Check that they have the requested balance
            if(accounts.chequings >= amt){
            //Move 'amt' from chequings to savings
                accounts.chequings -= amt;
                accounts.savings += amt;
                System.out.println("savings balance: $"+accounts.savings+" chequings balance: $"+accounts.chequings);
            }
            else{
                System.out.println("you do not have $"+amt+" in your chequings account");
            }
        }
        //2 refers to Savings to Chequings
        else if(s == 2){
            //Move 'amt' from savings to chequings
            //Check that they have the requested balance
            if(accounts.savings >= amt){
                //Move 'amt' from savings to chequings
                accounts.chequings += amt;
                accounts.savings -= amt;
                    System.out.println("savings balance: $"+accounts.savings+" chequings balance: $"+accounts.chequings);
                }
                else{
                    System.out.println("you do not have $"+amt+" in your savings account");
                }
        }
    }
}
