import java.util.Scanner; // gia input se login kai register

public class Screen10 {
    public boolean show_main_screen;

    public boolean show_regist_screen;
    public boolean pressed_login; //an pathse to login tote deixnoyme to login screen
    public boolean pressed_register; //an pathse to register tote deixnoume to register screen
    public String username;
    public String password;
    public String password_validation;  

    public boolean user_in_database; 
    public boolean user_logged_in;

    public Screen10()
    {
        show_main_screen = true;
        pressed_login = false;

        user_logged_in = false;
        user_in_database = false; 
    }

    public void main_screen()
    {

    }

    public void show_login_screen()
    {
        Scanner user_in = new Scanner(System.in);
        
        System.out.println("\ntype username:");
        username = user_in.nextLine(); 
        user_in.nextLine(); //consume \n
        
        System.out.println("\ntype password:");
        password = user_in.nextLine(); 
        user_in.close();

        user_logged_in = true;
    }

    public void show_regist_screen()
    {
        Scanner user_in = new Scanner(System.in);
        
        System.out.println("\ntype username:");
        username = user_in.nextLine(); 
        user_in.nextLine(); //consume \n
            
        do
        {
            System.out.println("\ntype password:");
            password = user_in.nextLine(); 
            user_in.nextLine(); //consume \n
            
            System.out.println("\ntype password again:");
            password_validation = user_in.nextLine(); 

            if(password != password_validation)
            {
                System.out.println("\npasswords do not match!\n")
            }

        } while(password != password_validation);

        System.out.println("\nYou have been registered successfully!\n");
        user_in_database = true;
        user_in.close();
    }

    public void play()
    {
        System.out.println("\nPLAY!\n");
    }




}//end public call screen

