package day12;
import java.util.ArrayList;

public class charcters {
    public static ArrayList playerStats(String choice){
        ArrayList<Integer> player = new ArrayList<Integer>();
        // works in the order of:
        //Health
        //Strength
        //Speed
        if(choice.equals("ork")){
            player.add(100);
            player.add(66);
            player.add(20);
        }
        else if(choice.equals("wizard")){
            player.add(20);
            player.add(100);
            player.add(66);
        }
        else if(choice.equals("elf")){
            player.add(66);
            player.add(20);
            player.add(100);
        }
        else{
            System.out.println("Because you dont belong to any faction we must"+
            " eliminate you as you are a potential threat and kill you");
            System.exit(0);
        }
        return player;
    }
}
