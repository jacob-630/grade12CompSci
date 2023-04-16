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
            player.add(1000);
            player.add(750);
            player.add(400);
        }
        else if(choice.equals("wizard")){
            player.add(400);
            player.add(1000);
            player.add(750);
        }
        else if(choice.equals("elf")){
            player.add(750);
            player.add(400);
            player.add(1000);
        }
        else{
            System.out.println("Because you dont belong to any faction we must"+
            " eliminate you as you are a potential threat and kill you");
            System.exit(0);
        }
        player.add(100);
        return player;
    }

    /**
     * 
     * @param health The enemys health 
     * @param strength the enemys strength 
     * @param speed the enemys speed
     * @return
     */
    public static ArrayList createEnemy(Integer health, Integer strength, Integer speed){
        ArrayList<Integer> enemy = new ArrayList<Integer>();
        enemy.add(health);
        enemy.add(strength);
        enemy.add(speed);
        return enemy;
    }








    /**
     * This function enables all the battling between the player and an enemy
     * @param player the players stats
     * @param enemy the enemy youre fighting
     * @return boolean 1 for win 0 for lose
     */
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
                pHealth -= eDamage;

                //subtract the players damage from the enemys health
                if(pHealth > 0){
                    eHealth -= pDamage;
                }

            }
            //else the player is faster and attackes first
            else{
                //subtract the players damage from the enemys health
                eHealth -= pDamage;

                //Subtract the enemys damage from the players health 
                if(eHealth > 0){
                    pHealth -= eDamage;
                }

            }
        }
        if(eHealth > 0){
            player.set(0, 0);
            return false;
        }
        else{
            player.set(0, pHealth);
            return true;
        }
    }


    /**
     * 
     * @param player Input the player you wanna change
     * @param option the stat youre looking to effect
     * @param cash the amount youre spending
     */
    public static void shop(ArrayList player, String option, int cash){
        int offer = (int)((Math.random()+1)*cash);
        
        if(option.equals("health")){
            System.out.println("Ah so youre buying some more health hmm? well let me think about "+
            "how much health I can give you for $"+cash);
            additionalFunc.pause(10);
            System.out.println("Alright ill give you "+offer+" health");
            player.set(0, (int)player.get(0)+offer);

        }
        else if(option.equals("strength")){
            System.out.println("Ah so youre buying some more strength hmm? well let me think about "+
            "how much strength I can give you for $"+cash);
            additionalFunc.pause(10);
            System.out.println("Alright ill give you "+offer+" strength");
            player.set(1, (int)player.get(1)+offer);
            

        }
        else if(option.equals("speed")){
            System.out.println("Ah so youre buying some more speed hmm? well let me think about "+
            "how much speed I can give you for $"+cash);
            additionalFunc.pause(10);
            System.out.println("Alright ill give you "+offer+" speed");
            player.set(2, (int)player.get(2)+offer);
            

        }
        else{
            System.out.println("I dont have time for random items that dont exist. GET OUT! AND IM KEEPING THE CHANGE!!");

        }
        player.set(3, (int) player.get(3)-cash);
        System.out.println("Alright your new stats are health: "+player.get(0) +" Strength: "+player.get(1)+
        " Speed: "+player.get(2) + " Cash: "+player.get(3));
    }
}
