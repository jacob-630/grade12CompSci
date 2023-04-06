import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<String> userArray = new ArrayList<String>();

        boolean cont = true;
        while(cont){
            //print intro and options of what to do
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("What would you like to do with your array list?");
            System.out.println("Enter '1' to print array list");
            System.out.println("Enter '2' to add to your array list");
            System.out.println("Enter '3' to change an element of your array list");
            System.out.println("Enter '4' to remove an element of your array list");
            System.out.println("Enter '5' to exit the program");

            //gain input on what the user would like to do
            String action = inp.nextLine();

            if(action.equals("1")){
                //Check if the array list is empty
                if(userArray.isEmpty()){
                    System.out.println("Your array is currently empty");
                }
                //Print the size of the users array
                else{
                    functions.printArray(userArray);
                }

            }
            else if(action.equals("2")){
                //Add an element to the users array
                System.out.println("Please enter the element you wish to add to the array");
                String element = inp.nextLine();
                functions.addElement(userArray, element);

            }
            else if(action.equals("3")){
                //Take 2 paramaters, one for element number and one for what to change it to
                System.out.println("Please enter the integer of the position youd like to change,"+
                " followed by what youd like to change it to");
                int pos = inp.nextInt();
                String element = inp.nextLine();

                functions.changeElement(userArray, pos, element);

            }
            else if(action.equals("4")){
                //Remove an element from array (Take element number)
                System.out.println("Enter the integer of the position you'd like to remove");
                int ele = inp.nextInt();
                functions.removeElement(userArray, ele);

            }
            else if(action.equals("5")){
                //Exit the program and leave
                cont = false;
            }
            else{
                //provoide a catch in case the user inputs an invalid input
                System.out.println("The input you submitted was invalid, please input either '1', "+
                "'2', '3', '4', or '5'");
            }
        }
    }
}
