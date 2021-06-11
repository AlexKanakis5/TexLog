//package diagram9;
import java.util.Scanner;



public class Main{
    
    public static void main(String args[]) {
        System.out.println("\n Type 1 to search with mic\n Type 2 to search without mic");

        
        Scanner user_in = new Scanner(System.in);
        Screen sc = new Screen();

        sc.show_friends_screen();

        if (sc.pressed_add_friend)
        {
            sc.show_add_friend_screen();

            if(sc.enable_mic)
            {
                System.out.println("\n Type 1 to search with mic\n Type 2 to search without mic");
                
                int mic_search = user_in.nextInt(); //anazhththsh me mikrofwno h oxi 

                if (mic_search == 1)
                {
                    sc.search_player_mic();
                }

                if (mic_search == 2)
                {
                    sc.search_player();
                }
                
            }//end enable mic |
     
        }//end pressed add friend

        if (sc.pressed_show_friend_requests)
        {
            sc.show_friends_screen();
        }

        
        user_in.close();

    }//end void main


}// END MAIN
