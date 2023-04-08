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


        //Assigning the player to the stats of the faction they chose
        ArrayList playerStats = charcters.playerStats(faction);
        
        //have random number generators to make certain events RNG based
        //have choices with consequences ie.
        //"allocate what percent to attack v defence"you focused to much on attack and died
        //have a rpg kind of dialogue, potentially multiple choice and numeric input


    }
    
}
