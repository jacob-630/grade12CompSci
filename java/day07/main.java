package day07;

public class main {
    public static void main(String[] args){
        createFile nw = new createFile();
        nw.createFile("MyFile.txt");
        writeFile wf = new writeFile();
        wf.writeFile("myFirstFile.txt");
        readFile rf = new readFile();
        String o = rf.readFile("myFirstFile.txt");
        System.out.println(o);
    }
    
    
}
