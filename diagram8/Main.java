package diagram8;


/*EXEI POLLA ENDELSS LOOPS giati den kserw pws tha poume oti allazoun ta screens 
  oti exw grapsei einai entelws "proof of concept"
  ayth th stigmh mexri na paththei to escape, deixnei synexws to idio screen
  
  oxi apla to deixnei, alla synexws kanei refresh to periexomeno toy screen
  tha prepei na brethei kapoios poio katallhlos tropos gia na yolopoihthei ayto gia na apofygoyme ayta ta loops

*/




public class Main{
    
    public static void main(String args[]) {
        
        Screen sc = new Screen();


        sc.show_login_screen();

        boolean press_escape = false;   //metablhth gia to an exei paththei to escape 

        if (sc.login_success)
        {
            
            while (press_escape == false) //ypotithetai oti me kapoion tropo pataei to escape 
            {
                sc.show_main_screen();

            }//end show main screen
            sc.show_login_screen();

        }//end login_success

        if (sc.pressed_help)
        {       
            while (press_escape == false) //show help screen mexri na paththei to escape
            {

                sc.show_help_screen();

            }//end show login screen

                //otan paththei to escape gyrname sto arxiko screen
                sc.show_login_screen();

        }//end pressed help

        if (sc.pressed_message)
        {
            while (press_escape == false) //show help screen mexri na paththei to escape
            {
                
                sc.show_message_screen();

            } //end show message screen

            sc.show_login_screen();
        }//end pressed_message


    }//end void main


}// END MAIN