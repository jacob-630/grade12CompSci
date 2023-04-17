package day06;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class fileChanges {
    public static void createFile(){
        File newFile = new File("myFirstFile.txt");

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
