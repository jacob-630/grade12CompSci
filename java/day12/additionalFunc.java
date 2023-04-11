package day12;
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
    
}
