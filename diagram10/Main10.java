
public class Main10 {
    
    public static void main(String[] args) {
        

        Screen10 sc = new Screen10();

        sc.main_screen();

        if (sc.pressed_login)
        {
            sc.show_login_screen();
        }

        if (sc.pressed_register)
        {
            sc.show_regist_screen();
        }

        if (sc.user_logged_in && sc.user_in_database)
        {
            sc.play();
        }


    }    
}
