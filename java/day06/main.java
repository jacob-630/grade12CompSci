package day06;
import java.util.Scanner;;
public class main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Would you like to enter your account?");
        String ans = (inp.next()).toLowerCase();
        if(ans.equals("yes") ){
            System.out.println("input your savings account balance followed "
            +"by your checking account balance");
            String savings = inp.next();
            String chequings = inp.next();
            float savingsBal = Float.valueOf(savings);
            float chequingsBal = Float.valueOf(chequings);
            accounts d = new accounts(savingsBal, chequingsBal);
            
            //Make changes to accounts:
            while(1 < 2){
                System.out.println("What would you like to do? enter "
                +"'deposit', 'withdraw', 'credit', or anything else to leave");
                String chngs = inp.next();
                if(chngs.equals("deposit")){
                    System.out.println("Which account would you like to change? ('savings' or 'chequings')");
                    String acc = inp.next();

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
                    else{
                        System.out.println("Invalid input, goodbye");
                        System.exit(0);
                    }
                }
                else if(chngs.equals("withdraw")){
                    System.out.println("Which account would you like to change? ('savings' or 'chequings')");
                    String acc = inp.next();

                    if(acc.equals("savings")){
                        System.out.println("How much would you like to withdraw?");
                        String depo = inp.next();
                        Float depAmt = Float.valueOf(depo);
                        accounts.savingsWith(depAmt);
                    }
                    else if(acc.equals("chequings")){
                        System.out.println("How much would you like to deposit?");
                        String depo = inp.next();
                        Float depAmt = Float.valueOf(depo);
                        accounts.chequingWith(depAmt);
                    }
                    else{
                        System.out.println("Invalid input, goodbye");
                        System.exit(0);
                    }
                }
                else if(chngs.equals("credit")){
                    accounts.credit();
                }
                else{
                    System.out.println("okay, have a good day");
                    System.exit(0);
                }
            }
        }
    }
}