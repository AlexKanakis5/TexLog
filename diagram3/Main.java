package diagram3;
import java.util.Scanner;

/*edw mporei na ylopoihthei ena deck 

    mporei na breite ayto to video xrhsimo gia to pws tha ginei https://www.youtube.com/watch?v=AckjW0C2vc8
    
    skefteite epishs oti pera apo tis kanonikes kartes ths trapoulas exoume kai 4 eidikes
    Majong Drakos Skylia Pouli

    profanws tha exoume 4 paiktes opote olh h diadikasia tha prepei na ginei kai gia toys 4

    prepei na dhmiourghsoume 4 Player objects: km1 , km2 , km3 , km4 
     
    tha mporousame na xrhsimopoihsoyme mia for 


*/
public class Main{
    public static void main(String args[]) {
        Player km=new Player();

        
        Scanner user_in = new Scanner(System.in);  // Scan user input 


        //πριν το acceptcards θα πρεπει να καλουμε μια ρουτινα  που θα μοιραζει την τραπουλα
        //exoume 4 paiktes se kathe dwmatio opote tha prepei na moirazontai ta xartia se kathe Player object h toulaxiston etsi to skeftomai
        //mporoume na kanoume prwta to prwto moirasma gia ton paikth km1, dhladh na tou dwsoume 8 kartes (an thyamai kala to tichu)
        //na ginei to prwto kommati ths diadikasias gia ayton, na pei grand tichu ama thelei kai meta gia tous epomenous
        // molis teleiwsei o prwtos gyros meta kanoume to idio, moirazoume 6 kartes (an thumamai kala) apo thn ypoloiph trapoula kai kanoume pali epanalhpsh gia tous ypoloipoius



        //edw tha arxize h mia for
        km.acceptCards();
        km.understandCards();
        //teleiwse to prwto moirasma 



        System.out.println("Type 1 if you want to declare GRAND tichu");
        int decl_grand_tichu = user_in.nextInt();  // for grand_tichu

        if (decl_grand_tichu == 1)
        {
            km.grand_tichu();
        }

        km.printState();    //ektypwnoume to state mexri stigmhs 


        //edw tha teleiwne h mia for 


        //edw tha arxize h epomenh for
        //moirazoume kai tis ypoloipes kartes
        km.acceptRestCards();
        km.understandingRestCards();

        System.out.println("Type 1 if you want to declare tichu");
        int decl_tichu = user_in.nextInt();  // for tichu

        if (decl_tichu == 1)
        {
            km.tichu();
        }
        km.printState(); //ektypwnoume to teliko state

        //edw tha teleiwne h epoenh for, kai eimaste etoimoi na ksekinhsei to paixnidi
    }
}

