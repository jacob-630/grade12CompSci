package day08;
import java.io.IOException;
import java.io.FileWriter;
public class writeFile {
    public void writeFile(String file, String amt){
        try{
            FileWriter fw = new FileWriter(file);
            fw.write(amt);
            fw.close();
            System.out.println("added to file");
        }
        catch(IOException e){
            System.out.println("error occured");
            e.printStackTrace();
        }
    }
}
