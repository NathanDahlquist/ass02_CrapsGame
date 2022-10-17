import java.util.Scanner;
import java.util.Random;

public class CrapsGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        Boolean restartGame = false;
        int die1 = 0;
        int die2 = 0;
        int p1 = 0;
        Boolean p1R;
        int dieTotal = 0;
        String restartPrompt = "";

        do{
            do{
                die1 = rnd.nextInt(6)+1;
                die2 = rnd.nextInt(6)+1;
                dieTotal = die1 + die2;
                System.out.println("You have rolled " + dieTotal);
                if(dieTotal == 2 || dieTotal == 3 || dieTotal == 12){
                    System.out.println("You loses");
                    p1R = true;
                }else if(dieTotal == 7 || dieTotal == 11){
                    System.out.println("You have won with " + p1 + " points");
                    p1R = true;
                }else{
                    p1 = p1 + dieTotal;
                    System.out.println("You have gained " + dieTotal + " points, and your score is now " + p1);
                    p1R = false;
                }
            }while(!p1R);
            System.out.println("Would you like to play again? [Y/N]");
            restartPrompt = in.next();
            if(restartPrompt.equalsIgnoreCase("N")){
                restartGame = true;
                System.out.println("Goodbye!");
            }
        }while(!restartGame);
    }
}