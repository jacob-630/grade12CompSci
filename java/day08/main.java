package day08;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class main {
    public static void main(String[] args) {
        //create the scanner for input
        Scanner inp = new Scanner(System.in);
        System.out.println("Would you like to enter your account? if so enter 'yes'");
        String ans = (inp.next().toLowerCase());
        //check that they do wish to enter account
        if(ans.equals("yes")){
            int savingsBal = 1000;
            int chequingsBal = 1000;
            System.out.println("input your savings account balance followed "
            +"by your checking account balance");
            //convert balances to floats and then create an instance of accounts
            accounts d = new accounts(savingsBal, chequingsBal);
            createFile savingsFile = new createFile();
            savingsFile.createFile("Savings.txt");
            createFile chequingsFile = new createFile();
            chequingsFile.createFile("Chequings.txt");
            
            
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