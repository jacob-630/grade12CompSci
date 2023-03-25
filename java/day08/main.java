package day08;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        //create the scanner for input
        Scanner inp = new Scanner(System.in);
        System.out.println("Would you like to enter your account? if so enter 'yes'");
        String ans = (inp.next().toLowerCase());
        //check that they do wish to enter account
        if(ans.equals("yes")){
            
            //initalize account
            Float savingsBal = (float) 1000.0;
            Float chequingsBal = (float) 1000;
            accounts d = new accounts(savingsBal, chequingsBal);
            
            
            //Create Files for savings and chequings accounts if they dont already exist
            createFile savingsFile = new createFile();
            savingsFile.createFile("Savings.txt");
            createFile chequingsFile = new createFile();
            chequingsFile.createFile("Chequings.txt");
            
            
            //Make changes to accounts:
            //a loop to run for forever unless broken with 'break' command
            while(1 < 2){
                System.out.println("What would you like to do? enter "
                +"'deposit', 'withdraw', or anything else to quit the program");
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
                        //Write to the file the changes being made
                        writeFile wf = new writeFile();
                        wf.writeFile("Savings.txt", Float.toString(accounts.savings));
                    }
                    else if(acc.equals("chequings")){
                        System.out.println("How much would you like to deposit?");
                        String depo = inp.next();
                        Float depAmt = Float.valueOf(depo);
                        accountChanges.chequingsDepo(depAmt);
                        //Write to the file the changes being made
                        writeFile wf = new writeFile();
                        wf.writeFile("Chequings.txt", Float.toString(accounts.chequings));
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
                        //Write to the file the changes being made
                        writeFile wf = new writeFile();
                        wf.writeFile("Savings.txt", Float.toString(accounts.savings));
                    }
                    //withdraw from chequings
                    else if(acc.equals("chequings")){
                        System.out.println("How much would you like to withdraw?");
                        String depo = inp.next();
                        Float depAmt = Float.valueOf(depo);
                        accountChanges.chequingWith(depAmt);
                        //Write to the file the changes being made
                        writeFile wf = new writeFile();
                        wf.writeFile("Chequings.txt", Float.toString(accounts.chequings));
                    }
                    //else statement to catch all exceptions
                    else{
                        System.out.println("Invalid input, goodbye");
                        System.exit(0);
                    }
                }
                else if(chngs.equals("credit")){
                    accountChanges.credit();
                    d = new accounts(accounts.savings, accounts.chequings, accountChanges.credit());
                }
                else{
                    System.out.println("okay, have a good day");
                    System.exit(0);
                }
            }
        }
        else{
            System.out.println("Okay. Have a good day.");
            System.exit(0);
        }
    }

}