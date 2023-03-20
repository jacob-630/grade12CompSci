package day07;

import java.io.IOException;
import java.io.FileWriter;
public class writeFile {
    public static void writeFile(String file){
        try{
            FileWriter fw = new FileWriter(file);
            fw.write("My First File");
            fw.write("\n \n \n More text here");
            fw.close();
            System.out.println("added to file");
        }
        catch(IOException e){
            System.out.println("error occured");
            e.printStackTrace();
        }
    }
    
}
