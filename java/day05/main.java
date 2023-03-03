package day05;
import java.util.Scanner;;
public class main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("input your cars make, model and year keeping in "
        +"mind the make and model can only be one word each");
        String mke = inp.next();
        String modl = inp.next();
        int yer = inp.nextInt();

        car d = new car(mke, modl, yer);
        
    }
}
