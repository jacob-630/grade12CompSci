package day12;

import java.util.ArrayList;

public class hardPath {
    public static boolean runHardMode(ArrayList player){
        System.out.println("This is the hard path so no more Mr. nice guy got it? "+
        "things are about to get much faster and harder as well, so good luck... youll need it");
        additionalFunc.pause(4);

        System.out.println("Gremlin boss: Here I come! Lets Fight");
        System.out.println("Dragon Solider: RAHHH!! HERE I COME TOO");
        additionalFunc.pause(8);
        ArrayList Dsolider = charcters.createEnemy(600, 300, 400);
        ArrayList Gboss = charcters.createEnemy(400, 400, 400);
        charcters.battle(player, Gboss);
        charcters.battle(player, Dsolider);
        System.out.println("Wow you really stood your ground, but now you only have "+player.get(0)+" health but at least"+
        " you were able to steal $400 from the enemies");
        player.set(3, (int)player.get(3) + 400);
        additionalFunc.pause(7);

        System.out.println("Now since youre taking the fast track we dont have time to go see sally so we're "+
        "heading straight up the volcano. up the dangerous way of course");
        additionalFunc.pause(4);
        System.out.println("Oh No here comes Metors Quick dodge them!");
        System.out.println("enter a number 1-5 to dodge the metors, if you choos the wrong number you will be hit and lose 100 health");

        int hits = additionalFunc.metor();

        player.set(0, (int) player.get(0)-(hits*100));
        if((int) player.get(0) > 0){
            System.out.println("You made it to the top with "+ player.get(0) + " health left");
            System.out.println("Congratulations you've Made it to the final boos!");
            return true;
        }
        else{
            System.out.println("Oh no the metors got you :(");
            return false;
        }
        
    }

    public static void hardEndGame(ArrayList player){
        System.out.println("like I said I wont be helping you so youre gonna need to take on "+
        "both the bosses");
        additionalFunc.pause(2);
        System.out.println("Dragon King: We are here to stop you");
        additionalFunc.pause(2);
        System.out.println("Dragon Queen: We are the new rulers of this kingdom and nothing you do can change that");
        additionalFunc.pause(2);
        System.out.println("Dragon King: We are both going to fight you at the same time");
        additionalFunc.pause(2);
        System.out.println("Dragon Queen: Enough talking, lets fight");
        additionalFunc.pause(2);
        ArrayList dragonKing = charcters.createEnemy(1000, 1000, 750);
        ArrayList dragonQueen = charcters.createEnemy(1000, 750, 1000);

        if(charcters.battle(player, dragonKing)){
            System.out.println("THE DRAGON KING IS DOWN, JUST THE QUEEN NOW!");
            additionalFunc.pause(2);
            if(charcters.battle(player, dragonQueen)){
                System.out.println("OH MY GOD!!! YOU WON!!!");
                if((int) player.get(0) <= 0){
                    System.out.println("You died while saving this world. You truly are a hero!");
                    System.exit(0);
                }
            }
        }
        
    }
}
