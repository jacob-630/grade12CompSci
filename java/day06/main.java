package day06;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class main {
    public static void main(String[] args) {
        //create a pin for the user
        int pin = (int) Math.round(Math.random()*10000 - 1);
        System.out.println("your pin will be " + pin);
        //create the scanner for input
        Scanner inp = new Scanner(System.in);
        System.out.println("Would you like to enter your account? if so please enter your pin. (your pin is in the line above)");
        int ans = (inp.nextInt());
        //check that they do wish to enter account
        if(ans == pin){
            System.out.println("input your savings account balance followed "
            +"by your checking account balance");
            //convert balances to floats and then create an instance of accounts
            String savings = inp.next();
            String chequings = inp.next();
            float savingsBal = Float.valueOf(savings);
            float chequingsBal = Float.valueOf(chequings);
            accounts d = new accounts(savingsBal, chequingsBal);
            
            //Make changes to accounts:
            //a loop to run for forever unless broken with 'break' command
            while(1 < 2){
                System.out.println("What would you like to do? enter "
                +"'deposit', 'withdraw', 'credit', 'cmpndInt', 'transfer', 'checkBalance' or anything else to leave");
                String chngs = inp.next().toLowerCase();
                //first layer of if statements; check which account the user would like to manipulate:
                if(chngs.equals("deposit")){
                    System.out.println("Which account would you like to change? ('savings' or 'chequings')");
                    String acc = inp.next().toLowerCase();


                    //navigate into those functions and call the specific commands to make the 
                    //appropriate changes
                    if(acc.equals("savings")){
                        System.out.println("How much would you like to deposit?");
                        String depo = inp.next();
                        Float depAmt = Float.valueOf(depo);
                        accountChanges.savingsDepo(depAmt);
                    }
                    else if(acc.equals("chequings")){
                        System.out.println("How much would you like to deposit?");
                        String depo = inp.next();
                        Float depAmt = Float.valueOf(depo);
                        accountChanges.chequingsDepo(depAmt);
                    }
                    //default case with a System exit to end the program
                    else{
                        System.out.println("Invalid input, goodbye");
                        System.exit(0);
                    }
                }

                //run all the code to withdraw funds from an account
                else if(chngs.equals("withdraw")){
                    System.out.println("Which account would you like to change? ('savings' or 'chequings')");
                    String acc = inp.next();

                    //withdraw from savings account
                    if(acc.equals("savings")){
                        System.out.println("How much would you like to withdraw?");
                        String depo = inp.next();
                        Float depAmt = Float.valueOf(depo);
                        accountChanges.savingsWith(depAmt);
                    }
                    //withdraw from chequings
                    else if(acc.equals("chequings")){
                        System.out.println("How much would you like to withdraw?");
                        String depo = inp.next();
                        Float depAmt = Float.valueOf(depo);
                        accountChanges.chequingWith(depAmt);
                    }
                    //else statement to catch all exceptions
                    else{
                        System.out.println("Invalid input, goodbye");
                        System.exit(0);
                    }
                }
                else if(chngs.equals("credit")){
                    accountChanges.credit();
                    d = new accounts(savingsBal, chequingsBal, accountChanges.credit());
                }

                //input a compound interest calculation that can also hand additional annual contributions
                else if(chngs.equals("cmpndint")){
                    System.out.println("input your principal investment, followed by your expected anual rate of return " + 
                    "then your hold duration in years, and finally your additional contribution amount per year.");
                    float P = Float.valueOf(inp.next());
                    float R = Float.valueOf(inp.next())/100;
                    float N = 1;
                    float T = Float.valueOf(inp.next());
                    float PMT = Float.valueOf(inp.next());
                    float sum = (float) Math.round(((P * (Math.pow((R/N+1), (N*T)))) + PMT * ((Math.pow((R/N +1), (N*T))) - 1)/(R/N))*100)/100;
                    
                    System.out.println("The sum of the money you will make is " + sum);

                }
                //Transfer money between accounts
                else if(chngs.equals("transfer")){
                    System.out.println("How much money would you like to transfer:");
                    float TransfrAmt =Float.valueOf(inp.next());
                    System.out.println("How would you like to transfer funds. Please enter either 'CtoS' or 'StoC'" );
                    String trnsfr = inp.next().toLowerCase();
                    if(trnsfr.equals("ctos")){
                        accountChanges.trnsfr(1, TransfrAmt);
                    }
                    else if(trnsfr.equals("stoc")){
                        accountChanges.trnsfr(2, TransfrAmt);
                    }
                }
                else if(chngs.equals("checkbalance")){
                    accountChanges.checkBalancs();
                }
                else{
                    System.out.println("okay, have a good day");
                    System.exit(0);
                }
            }
        }
        else{
            System.out.println("Invalid Pin, access denied.");
            System.exit(0);
        }
    }

}