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

        while(Integer.valueOf((String) player.get(0)) > 0 && Integer.valueOf((String) enemy.get(0)) > 0){
            //check who has a greater speed value Enemy or Player
            //if the enemy is faster
            if(Integer.valueOf((String) enemy.get(2)) > Integer.valueOf((String) player.get(2)) ){
                //Subtract the enemys damage from the players health 
                int enemyDamage = Integer.valueOf((String) enemy.get(1));
                player.set(0, (Integer.valueOf((String) player.get(0)) - enemyDamage));

                //subtract the players damage from the enemys health
                int playerDamage = Integer.valueOf((String) player.get(1));
                enemy.set(0, (Integer.valueOf((String) enemy.get(0)) - playerDamage));
            }
            //else the player is faster and attackes first
            else{
                //subtract the players damage from the enemys health
                int playerDamage = Integer.valueOf((String) player.get(1));
                enemy.set(0, (Integer.valueOf((String) enemy.get(0)) - playerDamage));

                //Subtract the enemys damage from the players health 
                int enemyDamage = Integer.valueOf((String) enemy.get(1));
                player.set(0, (Integer.valueOf((String) player.get(0)) - enemyDamage));

            }
        }
        if(Integer.valueOf((String) player.get(0)) > 0){
            return true;
        }
        else{
            player.set(0, 0);
            return false;
        }
    }
}
