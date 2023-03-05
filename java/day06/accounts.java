package day06;

public class accounts {
    public static float savings;
    public static float chequings;

    

    accounts(){}

    accounts(float savings, float chequings){
        this.savings = savings;
        this.chequings = chequings;
        System.out.println("savings: "+this.savings + " " + "chequings:" + this.chequings);
    }
    public static  void savingsDepo(float amt){
        savings+=amt;
        System.out.println("savings: "+savings);
    }
    public static void chequingsDepo(float amt){
        chequings+=amt;
        System.out.println("savings: "+chequings);
    }
    public static void savingsWith(float amt){
        if(savings > amt)
            {savings-=amt;
            System.out.println("savings: "+savings);
        }
        else{
            System.out.println("Insifficent funds in the selected account.");
        }
    }
    public static void chequingWith(float amt){
        if(chequings > amt)
        {savings-=amt;
        System.out.println("chequings: "+chequings);
    }
    else{
        System.out.println("Insifficent funds in the selected account.");
    }
    }
    public static void credit(){
        float total = (chequings + savings)/2;
        System.out.println("you are approved for credit up to $"+total);
    }

}
