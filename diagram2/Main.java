package diagram2;
import java.util.Scanner;

/*
   to project mas tha prepei na ipostirizei 64 diladi 128 paixtes
    
    
*/


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

            while ( (number_of_players > 40) || (number_of_players<2) || (number_of_players%2 != 0) )
            {

                if (number_of_players <= 1)
                {
                    System.out.println("Player number cannot be <= 1\n"); 
                }

                if (number_of_players%2 != 0) //gia na mporoun na dhmiourghthoun oi omades
                {
                    System.out.println("Player number must be divisible by 2\n"); 
                }

                System.out.println("Invalid player number (MAX 40)\n");
                number_of_players = user_in.nextInt();

            } //end while
            System.out.println("Number of players:"+number_of_players); 
            System.out.println("\nCreating teams...\n"); 
            int team_number = number_of_players / 2 ;
            
            Player p_1=new Player();
            Player p_2=new Player();
            Team tm1=new Team(p_1,p_2);
            
            
            System.out.println("Teams created:" +team_number);
            

            System.out.println("\nteamscore:"+tm1.TeamScore(true)); // "true" = team won
                                                                    //h TeamScore() epistrefei int 
                                                                    //den yparxei kapoios logos na ektypwnetai se ayto to shmeio 
                                                                    //apla gia debug

            
            // to show table einai entelws eikoniko 
            //kanonika tha deixname se gui ena megalo table me tis omades 
            //den einai anagki na to kanoume na douleyei me 20 omades, mporoume na to dokimasoume me 2
            //tha mporouse kapoios edw na ektypwnei ena table me tis omades 
            // p.x. TEAM1 : player1,player2,player3,player4, TEAM2: ...
            //den kserw an xreiazetai, yparxoun pio shmantika pragmata poy mporoyn na ginoyn pros to paron 
            boolean show_table = true;
            System.out.println("\nshow_table:" +show_table);
        }
        else
        {
            System.out.println("*Goodbye*\n");
        }
    }//end void main
}//END MAIN
