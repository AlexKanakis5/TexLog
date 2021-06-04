package diagram2;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner user_in = new Scanner(System.in);
        System.out.println("***********\nPRESS PLAY!\n***********");
        System.out.println("-type 1-\n");
        int press_play = user_in.nextInt();

        if (press_play == 1)
        {
            System.out.println("Type number of players (MAX 40)\n"); //den kserw posoi paiktes, allakste to ayto
            int number_of_players = user_in.nextInt();

            while ( (number_of_players > 40) || (number_of_players<4) || (number_of_players%4 != 0) )
            {

                if (number_of_players <= 3)
                {
                    System.out.println("Player number cannot be <= 3\n"); 
                }

                if (number_of_players%4 != 0) //gia na mporoun na dhmiourghthoun oi omades
                {
                    System.out.println("Player number must be divisible by 4\n"); 
                }

                System.out.println("Invalid player number (MAX 40)\n");
                number_of_players = user_in.nextInt();

            } //end while

            System.out.println("Creating teams...\n"); 
            int team_number = number_of_players / 4 ;
            System.out.println("Teams created:" +team_number);
 
            boolean show_table = true;
            System.out.println("\nshow_table:" +show_table);
        }
        else
        {
            System.out.println("*Goodbye*\n");
        }
    }
}
