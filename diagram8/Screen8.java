import java.util.Scanner;
public class Screen8 {
    public boolean show_main_screen;
    public boolean show_help_screen;
    public boolean pressed_login;
    public boolean login_success;
    public boolean main_screen_with_username;
    public boolean pressed_help;
    public boolean pressed_message;
    public String password;
    public String username;

    public Screen8()
    {
        show_main_screen = false;
        show_help_screen = false;
        pressed_help = false;
        pressed_message = false;
        pressed_login = false;
        login_success = false;
        main_screen_with_username = false;
    }

    public void show_main_screen()
    {
        System.out.println("Welcome" +username);
        System.out.println("\nshowing main screen...\n");
    }

    public void show_help_screen()
    {
        System.out.println("showing help screen...\n");
    }
    public void show_message_screen()
    {
        System.out.println("showing message screen...\n");
    }

    public void show_login_screen()
    {
        Scanner user_in = new Scanner(System.in); 
        
        System.out.println("*Login*\n"); 
        System.out.println("*Message*\n"); 
        System.out.println("*Help*\n"); 

        if (pressed_login)
        {
            System.out.println("Type username:");
            String username = user_in.nextLine();
            System.out.println("\nType password:");
            String password = user_in.nextLine();
            login_success = true;
        }



    }
    
    public void show_main_screen_with_username() //meta to log in, emfanizetai i arxikh othonh me to username
    {
        main_screen_with_username = true;
        System.out.println("showing main screen username...\n");
    }    
}
