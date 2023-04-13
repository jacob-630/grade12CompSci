package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class easyPath {
    public static boolean runEasyPath(ArrayList player){
        Scanner inp = new Scanner(System.in);

        System.out.println("Welcome to the easy path, things are going to go a little slower now "+
        "this includes more stops at the shop and the chance to get even stronger");
        additionalFunc.pause(3);
        System.out.println("Lets start by venturing into the forest and finding an enemy to take down");
        additionalFunc.pause(5);


        System.out.println("Now in this forest there are many mystical creatures, the likes of youve likely never seen.");
        additionalFunc.pause(5);

        System.out.println("mystic tree: RAHHHH GRRRR");
        additionalFunc.pause(3);
        System.out.println("Quick attack the mystic tree, theyre quite weak and slow but have a lot of health");
        ArrayList mysticTree = charcters.createEnemy(10000, 100, 100);
        additionalFunc.pause(5);

        if(charcters.battle(mysticTree, player)){
            System.out.println("Good work! youre getting better at fighting!");
            additionalFunc.pause(3);
            System.out.println("Look! theres $300 on the tree");
            player.set(3, (int) player.get(3)+300);

        }
        else{
            System.out.println("Oh no the tree wrapped you up and has killed you.");
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
        if(cashSpent <= (int) player.get(3)){
            charcters.shop(player, upgrade, cashSpent);
        }
        else{
            System.out.println("So youre trying to pull a fast one on me??"+
            "you dont have that much money");
            additionalFunc.pause(1);
            System.out.println("GET OUT NOW!!!");
        }

        System.out.println("Since this is the easy path Im gonna give you a few more chances to battle and upgrade your gear.");
        System.out.println("as well as giving you 1000 hp after every fight");
        additionalFunc.pause(6);

        additionalFunc.easyModePractice("war hog", player);
        player.set(0, (int) player.get(0) + 1000);
        additionalFunc.easyModePractice("Knight", player);
        player.set(0, (int) player.get(0) + 1000);
        additionalFunc.easyModePractice("dragon fighter", player);
        player.set(0, (int) player.get(0) + 1000);

        System.out.println("Awesome job, now weve made it to the foot of the volcano mountain");
        additionalFunc.pause(4);
        System.out.println("on top of this mountain is the dragon king, defeat him and youll win the game");
        System.out.println("since you chose the easy path you can just follow these stairs up to the top.");
        






















        return false;
    }
}
