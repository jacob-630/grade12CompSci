package day12;
import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        //Intro to the game and collecting basic information
        Scanner inp = new Scanner(System.in);
        System.out.println("Hello strange creature and welcome to this magical world, "+
        "and what might I refer to you as? ");
        String name = inp.nextLine();
        System.out.println("Very well "+name+" and welcome to this strange world, allow me to explain:");
        additionalFunc.pause(2);
        System.out.println("Long long ago in a far away village lived a civilization. "+
        "Within this civilization existed many strange and powerful creatures. ");
        additionalFunc.pause(3);
        System.out.println("Orks whom are extremely resiliant with averge strength but are quite slow. ");
        additionalFunc.pause(3);
        System.out.println("Wizards whom posses the strength of magic and have averge speed but are hindered by their weakness. ");
        additionalFunc.pause(3);
        System.out.println("Elves are extremely fast and have averge resiliance but struggle to deal much damage");
        additionalFunc.pause(3);
        System.out.println("Now as for you, which faction do you reside in? \n Ork? \n Wizard? \n Elf?");
        String faction = inp.nextLine().toLowerCase();
        System.out.println("Ah I see, alright "+name+" the "+faction);
        additionalFunc.pause(4);
        System.out.println("With inflation these days things can get pretty pricey so heres $100 "+
        "it wont get you far but it's a start I suppose.");
        additionalFunc.pause(3);
        System.out.println("$100 has been added to your account.\n\n");
        additionalFunc.pause(5);


        //Assigning the player to the stats of the faction they chose
        ArrayList playerStats = charcters.playerStats(faction);
        System.out.println("Now lets get some practice in before going off to battle");
        additionalFunc.pause(2);
        System.out.println("This gremlin is going to try to attack you so give it your all");
        additionalFunc.pause(2);
        System.out.println("here it comes! now attack");
        additionalFunc.pause(5);
        ArrayList enemy1 = charcters.createEnemy(100, 100, 1000);

        //Call a battle between enemy and player
        if(charcters.battle(playerStats, enemy1)){
            System.out.println("very good you won!, your health is now " + playerStats.get(0));
        }
        else{
            System.out.println("Oh no, they got you and you died :(");
            System.exit(0);
        }
        
        System.out.println("Alright "+name+" head over to see Sally the Salesman where you can "+
        "purchase some upgrades");
        additionalFunc.pause(9);



        //Introduce Sally and the shop
        System.out.println("Hi! I'm Sally the Salesman, Here to help with all your shopping needs");
        System.out.println("Now what are you looking to buy? you only have one option so choose carefully"+
        " (health, strength or speed)");
        String upgrade = inp.nextLine().toLowerCase();
        System.out.println("and how much money are you intending to spend");
        int cashSpent = inp.nextInt();
        if(cashSpent <= (int) playerStats.get(3)){
            charcters.shop(playerStats, upgrade, cashSpent);
        }
        else{
            System.out.println("So youre trying to pull a fast one on me??"+
            "you dont have that much money");
            additionalFunc.pause(1);
            System.out.println("GET OUT NOW!!!");
        }
        //INTRODUCTION CONCULDES



        //MIDGAME BEGINS
        System.out.println("Alright "+name+" I need you to go defeat the dragon sorcerer"+
        " that being said, you may take whichever path youd like to complete this goal, "+
        "from here you may choose:");
        additionalFunc.pause(3);
        System.out.println("Option A) the long and easy path \n or");
        additionalFunc.pause(3);
        System.out.println("Option B) the fast and hard path \n so what will it be?");
        String eORh = inp.nextLine().toLowerCase();
        while(!eORh.equals("hard") && !eORh.equals("easy")){
            System.out.println("Please choose either 'easy' or  'hard'");
            eORh = inp.nextLine();
        }
        if(eORh.equals("hard")){
            System.out.println("So youve chosen the hard path. how daring.");
            hardPath.runHardMode(playerStats);

        }
        else if(eORh.equals("easy")){
            System.out.println("so youve chosen the easy path. well we all must start somwehere");
        }



        


    }
    
}
