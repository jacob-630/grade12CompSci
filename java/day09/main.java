package day09;
import java.util.Scanner;
public class main{
    
    public static void main(String[] args) {
        int correctAnswers = 0;
        String[] trueAnswers = {"456", "purple", "1910", "carbon", "brown", "four", "earth", "blue whale", "50", "brad"};
        String[] questions = {"1: what is the sum of 100 and 356?", "2: what is the resultant colour when you mix red and blue?",
        "3: what is 955 x 2?", "4: what is the 6th element on the periodic table?", "5: what is the most common eye colour?", 
        "6: fill in the blank there is one leap year every ____(spelt out) years", "7: what is the third closest planet to the sun",
        "8: what is the largest animal to ever live?", "9: what is the answer to the question: 100-25*2", "10: if Brads mom has 4 sons and three are named " + 
        "North, South, and East, what is the last sons name?"}; 
        String[] playerAnswers = new String[10];
        Scanner inp = new Scanner(System.in);
        System.out.println("answer each question as it is prompted");
        for(int i = 0; i < 10; i++){
        System.out.println(questions[i]);
        playerAnswers[i] = inp.nextLine().toLowerCase();
        if(playerAnswers[i].equals(trueAnswers[i])){correctAnswers++;}
        }
        
        System.out.println("Good job! you got "+correctAnswers+"/10 questions correct, thats "+(correctAnswers*10)+"%");
    }
}
