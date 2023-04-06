import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<String> userArray = new ArrayList<String>();

        boolean cont = true;
        while(cont){
            //print intro and options of what to do
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
                if(userArray.size() == 0){
                    System.out.println("Your array is currently empty");
                }
                //Print the size of the users array

            }
            else if(action.equals("2")){
                //Add an element to the users array

            }
            else if(action.equals("3")){
                //Take 2 paramaters, one for element number and one for what to change it to

            }
            else if(action.equals("4")){
                //Remove an element from array (Take element number)

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
