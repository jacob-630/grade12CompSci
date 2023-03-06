package day06;
import java.util.Scanner;;
public class main {
    public static void main(String[] args) {
        //create the scanner for input
        Scanner inp = new Scanner(System.in);
        System.out.println("Would you like to enter your account?");
        String ans = (inp.next()).toLowerCase();
        //check that they do wish to enter account
        if(ans.equals("yes") ){
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
                +"'deposit', 'withdraw', 'credit', or anything else to leave");
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
                        accounts.savingsDepo(depAmt);
                    }
                    else if(acc.equals("chequings")){
                        System.out.println("How much would you like to deposit?");
                        String depo = inp.next();
                        Float depAmt = Float.valueOf(depo);
                        accounts.chequingsDepo(depAmt);
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
                        accounts.savingsWith(depAmt);
                    }
                    //withdraw from chequings
                    else if(acc.equals("chequings")){
                        System.out.println("How much would you like to withdraw?");
                        String depo = inp.next();
                        Float depAmt = Float.valueOf(depo);
                        accounts.chequingWith(depAmt);
                    }
                    //else statement to catch all exceptions
                    else{
                        System.out.println("Invalid input, goodbye");
                        System.exit(0);
                    }
                }
                else if(chngs.equals("credit")){
                    accounts.credit();
                    d = new accounts(savingsBal, chequingsBal, accounts.credit());
                }
                else{
                    System.out.println("okay, have a good day");
                    System.exit(0);
                }
            }
        }
    }

}