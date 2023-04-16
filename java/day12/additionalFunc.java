package day12;
import java.util.ArrayList;
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

    public static void easyModePractice(String enemy, ArrayList player){
        Scanner inp = new Scanner(System.in);
        System.out.println(enemy+": RAHHHH GRRRR");
        additionalFunc.pause(3);
        System.out.println("Quick attack the "+enemy);
        ArrayList mysticTree = charcters.createEnemy(10000, 100, 100);
        additionalFunc.pause(5);

        if(charcters.battle(mysticTree, player)){
            System.out.println("Good work! youre getting better at fighting!");
            additionalFunc.pause(3);
            System.out.println("Look! theres $300 on the "+enemy);
            player.set(3, (int) player.get(3)+300);

        }
        else{
            System.out.println("Oh no the "+enemy+" has killed you.");
            System.exit(0);
        }

        System.out.println("Lets go see Sally and get you some upgrades");
        additionalFunc.pause(7);

        System.out.println("Hi! I'm Sally the Salesman, Here to help with all your shopping needs");
        System.out.println("Now what are you looking to buy? you only have one option so choose carefully"+
        " (health, strength or speed)");
        String upgrade = inp.nextLine().toLowerCase();
        System.out.println("and how much money are you intending to spend");
        int cashSpent = inp.nextInt();
        if(cashSpent <= (int) player.get(3) && cashSpent >= 0){
            charcters.shop(player, upgrade, cashSpent);
        }
        else{
            System.out.println("So youre trying to pull a fast one on me??"+
            "you dont have that much money");
            additionalFunc.pause(1);
            System.out.println("GET OUT NOW!!!");
        }
    }
    
}
