package day12;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class additionalFunc {
    public static void pause(int seconds){
        try{
            TimeUnit.SECONDS.sleep(seconds);
            
        }
        catch(InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public static int metor(){
        Scanner inp = new Scanner(System.in);
        int hits = 0;
        for(int i = 0; i <= 10; i ++){
            System.out.println("Quick Pick a number");
            int move = inp.nextInt();
            if(move > 5){
                move = 5;
            }
            int metor = (int) Math.round(Math.random()*5);
            if(move == metor){
                System.out.println("You've been hit!");
                hits++;
            }
            else{
                System.out.println("Good dodge!");
            }
        }
        return hits;
    }
    
}
