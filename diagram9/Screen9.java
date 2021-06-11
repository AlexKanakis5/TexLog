//package diagram9;
import java.util.ArrayList;

import java.util.Random; //gia th dhmiourgia random number kai random string
import java.util.Scanner;

public class Screen9 {
    public boolean show_friends_screen;
    public boolean show_add_friend_screen;
    public boolean pressed_add_friend;
    public boolean enable_mic;
    public boolean search_player_mic;
    public boolean search_player;
    public boolean pressed_show_friend_requests;
    
    public int friend_requests;
    ArrayList<String> friends = new ArrayList<String>();
    ArrayList<String> accepted_friends = new ArrayList<String>();


    public Screen9()
    {
        show_friends_screen = true; //gia na deiksei to frineds screen 
        show_add_friend_screen= false; 
        pressed_add_friend = false; //gia na deiksei to add friends screen
        enable_mic = false; //gia energopoihsh toy mic 
        pressed_show_friend_requests = false;


        Random rand = new Random(); //instance of random class
    
        //dhmiourgia friend requests kai enos array me friends
        int friend_requests= rand.nextInt(20); 



        //for loop gia to friend array
        for(int i=1;i<=friend_requests;i++)
        {
            int leftLimit = 97; // letter 'a'
            int rightLimit = 122; // letter 'z'
            int targetStringLength = 10;
            Random random = new Random();
            StringBuilder buffer = new StringBuilder(targetStringLength);
            for (int j = 0; j < targetStringLength; j++) {
                int randomLimitedInt = leftLimit + (int) 
                  (random.nextFloat() * (rightLimit - leftLimit + 1));
                buffer.append((char) randomLimitedInt);
            }
            String generatedString = buffer.toString();
            //System.out.println(generatedString);
            friends.add(generatedString);
        } //dhmiourgia array me friends analoga me ta posa friend requests exei 





    }

    public void show_friends_screen()
    {
        System.out.println("\nshowing friends screen...\n"+accepted_friends);
        
    }

    public void show_add_friend_screen()
    {
        System.out.println("\nshowing add friend screen...\n");
    }

    public void search_player_mic() //ayth h klash kanei anazhthsh me microfwno 
    {
        System.out.println("\nshowing players that you can add...\n");
    }

    public void search_player() //ayth h klash kanei anazhthsh xwris
    {
        System.out.println("\nshowing players that you can add...\n");
    }
    
    public void add_friend_message()
    {
        System.out.println("\nshowing friend requests...\n");
        
        // ektypwsh olwn twn friend requests (onomatwn friends, tyxaio string kai megethoss array)
       
            System.out.println("\n"+friends);



        // apo ayto to shmeio kai meta ylopoieitai ena loop gia thn apodoxh h diagrafh filwn    
        System.out.println("\nType 1 if you want to accept/remove a friend:");

        Scanner user_in = new Scanner(System.in);
        int add_remove_escape = user_in.nextInt(); 
        while(add_remove_escape == 1)
        {
            user_in.nextLine(); 
            System.out.println("\nType friend name:");
            String friend_name = user_in.nextLine(); 
            System.out.println("\nType accept|remove|cancel\n");
            String accept_remove_cancel = user_in.nextLine(); 
            if(accept_remove_cancel == "accept")
            {
                accepted_friends.add(friend_name);
                friends.remove(friend_name);
                System.out.println("\nFriend added to your friends list!\n"+friend_name);
                System.out.println("\nUpdated friends list"+accepted_friends);
            }
            if(accept_remove_cancel == "remove")
            {
                friends.remove(friend_name);
                System.out.println("\nFriend deleted from friend requests!\n"+friend_name);
            }
            if(accept_remove_cancel == "cancel")
            {
                System.out.println("\ncancelled..\n");
            }

            System.out.println("\nUpdated friends list"+friends);

            System.out.println("\nType 1 if you want to accept/remove a friend\nType 2 to cancel:");
            add_remove_escape = user_in.nextInt(); 


    
        } //end while add_remove_escape


         // apo ayto to shmeio kai meta ylopoieitai ena loop gia thn apodoxh h diagrafh filwn    

        user_in.close();
    }//end add friend message

}
