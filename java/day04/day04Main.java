package day04;
import java.util.Scanner;

public class day04Main {
    static Scanner inp = new Scanner(System.in);
    static day04Days dy = new day04Days();
    public static void main(String[] args) {
        

         boolean end = false;
         String ans;
         String days;
         System.out.println("run this program to learn about the days of the week");
         
         
        while(end == false){
            System.out.println("would you like to run the program? ('yes' or 'no') ");
            ans = (inp.next()).toLowerCase();
            if(ans.equals("yes")){
                System.out.println("Pick a day of the week or type 'random' for a random day");
                days = (inp.next()).toLowerCase();
                System.out.println(day04Days.getDay(days));
            }
            else{
                System.out.println("Thank you for using the program.");
                end = true;
            };

        }
        System.exit(0);
    }
}
