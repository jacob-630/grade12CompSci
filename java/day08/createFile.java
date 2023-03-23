package day08;

import java.io.File;
import java.io.IOException;
public class createFile {
    public static void createFile(String n){
        File newFile = new File(n);

        try{
            if(newFile.createNewFile()){
                System.out.println("New file created "+newFile.getName());
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
    
}
