import java.util.ArrayList;
public class functions {
    public static void printArray(ArrayList array){
        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
    }
    public static void addElement(ArrayList array, String element){
        array.add(element);
    }
    public static void changeElement(ArrayList array, int elementPos, String elementChng){
        if(elementPos >= 0 && elementPos < array.size()){
            array.set(elementPos, elementChng); 
        }
        else{
            System.out.println("That element position does not exist in this array.");
        }
    }
    public static void removeElement(ArrayList array, int elementPos){
        if(elementPos >= 0 && elementPos < array.size()){
            array.remove(elementPos); 
        }
        else{
            System.out.println("That element position does not exist in this array.");
        }
    }

}
