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
        System.out.println("Long long ago in a far away village lived a civilization. "+
        "Within this civilization existed many strange and powerful creatures. "+
        "Orks whom are extremely resiliant with averge strength but are quite slow. "+
        "Wizards whom posses the strength of magic and have averge speed but are hindered by their weakness. "+
        "Elves are extremely fast and have averge resiliance but struggle to deal much damage");
        System.out.println("Now as for you, which faction do you reside in? \n Ork? \n Wizard? \n Elf?");
        String faction = inp.nextLine().toLowerCase();
        System.out.println("Ah I see, alright "+name+" the "+faction);
        System.out.println("With inflation these days things can get pretty pricey so heres $100 "+
        "it wont get you far but it's a start I suppose.");
        System.out.println("$100 has been added to your account.\n\n\n\n");


        //Assigning the player to the stats of the faction they chose
        ArrayList playerStats = charcters.playerStats(faction);
        System.out.println("Now lets get some practice in before going off to battle");
        System.out.println("This gremlin is going to try to attack you so give it your all");
        System.out.println("here it comes! now attack");
        ArrayList enemy1 = charcters.createEnemy(1, 20, 15);

        //currently not working
        if(charcters.battle(playerStats, enemy1)){
            System.out.println("very good you won!, your health is now " + playerStats.get(0));
        }
        else{
            System.out.println("Oh no, they got you and you died :(");
            System.exit(0);
        }

        


    }
    
}
