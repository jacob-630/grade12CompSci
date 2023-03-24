package day08;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
public class readFile {
    public static String readFile(String file){
        String out = new String();
        try{
            File rf = new File(file);
            Scanner read = new Scanner(rf);

            while(read.hasNextLine()){
                out += read.nextLine()+"\n";
            }
        }
        catch(FileNotFoundException e){
            System.out.println("error occured: no file found");
            e.printStackTrace();
        }
        return out;
    }
}
