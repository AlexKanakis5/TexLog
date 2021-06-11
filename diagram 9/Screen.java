//package diagram9;
import java.nio.charset.Charset; //gia to friends array
import java.util.Random; //gia th dhmiourgia random number kai random string

public class Screen {
    public boolean show_friends_screen;
    public boolean show_add_friend_screen;
    public boolean pressed_add_friend;
    public boolean enable_mic;
    public boolean search_player_mic;
    public boolean search_player;
    public boolean pressed_show_friend_requests;
    
    public int friend_requests;
    public String[] friends;


    public Screen()
    {
        show_friends_screen = false; //gia na deiksei to frineds screen 
        show_add_friend_screen= false; 
        pressed_add_friend = false; //gia na deiksei to add friends screen
        enable_mic = false; //gia energopoihsh toy mic 
        pressed_show_friend_requests = true;


        /* ta parakatw eiani se sxolia den kserw giati trww ayto to error

        Exception in thread "main" java.lang.NullPointerException
        at Screen.<init>(Screen.java:40)
        at Main.main(Main.java:13)
        */

        // //dhmiourgia friend requests kai enos array me friends
        // Random rand = new Random();
        // int friend_requests = rand.nextInt(20);


        // //for loop gia to friend array
        // for(int i=1;i<=friend_requests;i++)
        // {
        //     byte[] array = new byte[friend_requests]; // length is bounded by 7
        //     new Random().nextBytes(array);
        //     String generatedString = new String(array, Charset.forName("UTF-8"));
        //     friends[i]= generatedString;
        // } //dhmiourgia array me friends analoga me ta posa friend requests exei 





    }

    public void show_friends_screen()
    {
        System.out.println("\nshowing friends screen...\n");
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
        
        // // ektypwsh olwn twn friend requests (onomatwn friends, tyxaio string kai megethoss array)
        // for(int i=1;i<=friend_requests;i++)
        // {
        //     System.out.println("\n"+friends[i]);
        // }

    }

}
