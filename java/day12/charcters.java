package day12;
import java.util.ArrayList;

public class charcters {
    public static ArrayList playerStats(String choice){
        ArrayList<Integer> player = new ArrayList<Integer>();
        // works in the order of:
        //Health
        //Strength
        //Speed
        // Money 
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
        player .add(100);
        return player;
    }

    public static ArrayList createEnemy(Integer health, Integer strength, Integer speed){
        ArrayList<Integer> enemy = new ArrayList<Integer>();
        enemy.add(health);
        enemy.add(strength);
        enemy.add(speed);
        return enemy;
    }

    public static boolean battle(ArrayList player, ArrayList enemy){

        int pHealth = (int) player.get(0);
        int eHealth = (int) enemy.get(0);
        int eSpeed = (int) player.get(2);
        int pSpeed = (int) player.get(2);
        int eDamage = (int) enemy.get(1);
        int pDamage = (int) enemy.get(1);
        while(pHealth > 0 && eHealth > 0){
            //check who has a greater speed value Enemy or Player
            //if the enemy is faster
            if(eSpeed > pSpeed){
                //Subtract the enemys damage from the players health 
                player.set(0, (pHealth-eDamage));
                pHealth -= eDamage;

                //subtract the players damage from the enemys health
                enemy.set(0, (eHealth-pDamage));
                eHealth -= pDamage;

            }
            //else the player is faster and attackes first
            else{
                //subtract the players damage from the enemys health
                enemy.set(0, (eHealth-pDamage));
                eHealth -= pDamage;

                //Subtract the enemys damage from the players health 
                player.set(0, (pHealth-eDamage));
                pHealth -= eDamage;

            }
        }
        if(pHealth > 0){
            return true;
        }
        else{
            player.set(0, 0);
            return false;
        }
    }
}
