package day10;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String quiz[][] = new String[5][6];
        String playerAnswers[] = new String[5];
        
        //question one
        quiz[0][0] = "1: what is the sum of 100 and 356?(Enter Either A, B, C or D)";
        quiz[0][1] = "A: 456";
        quiz[0][2] = "B: 256";
        quiz[0][3] = "C: 366";
        quiz[0][4] = "D: 455";
        quiz[0][5] = "A";
        
        //question two:
        quiz[1][0] = "2: what is the resultant colour when you mix red and blue?(Enter Either A, B, C or D)";
        quiz[1][1] = "A: Green";
        quiz[1][2] = "B: Burgandy";
        quiz[1][3] = "C: Purple";
        quiz[1][4] = "D: Pink";
        quiz[1][5] = "C";

        //question three:
        quiz[2][0] = "3: what is 955 x 2?(Enter Either A, B, C or D)";
        quiz[2][1] = "A: 1810";
        quiz[2][2] = "B: 1910";
        quiz[2][3] = "C: 2010";
        quiz[2][4] = "D: 1895";
        quiz[2][5] = "B";

        //question four:
        quiz[3][0] = "4: what is the 6th element on the periodic table?(Enter Either A, B, C or D)";
        quiz[3][1] = "A: Carbon";
        quiz[3][2] = "B: Oxygen";
        quiz[3][3] = "C: Neon";
        quiz[3][4] = "D: Fluorine";
        quiz[3][5] = "A";

        //question five:
        quiz[4][0] = "4: what is the largest animal to ever live?(Enter Either A, B, C or D)";
        quiz[4][1] = "A: T-Rex";
        quiz[4][2] = "B: Brontosaurus";
        quiz[4][3] = "C: Megalodon";
        quiz[4][4] = "D: Blue Whale";
        quiz[4][5] = "D";

        var correctAns = 0;
        for(int i = 0; i < quiz.length; i++){
            for(int j = 0; j < quiz[i].length-1; j++){
                System.out.println(quiz[i][j]);
            }
            playerAnswers[i] = inp.nextLine().toUpperCase();
            while(!playerAnswers[i].equals("A")&& !playerAnswers[i].equals("B")
             && !playerAnswers[i].equals("C") && !playerAnswers[i].equals("D")){
                System.out.println("Invalid input, please try again");
                playerAnswers[i] = inp.nextLine().toUpperCase();
                
            }
            if(playerAnswers[i].equals(quiz[i][5])){
                System.out.println("Congratulations! That was the Correct Answer");
                correctAns++;
            }
            else{
                System.out.println("Sorry thats not quite right, the correct answer was "+quiz[i][5]);
            }
        }
        System.out.println("Good job! you got "+correctAns+"/5, thats "+correctAns*20+"%!");
    }

    
}
