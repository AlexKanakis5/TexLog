package diagram3;
import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Player km=new Player();

        
        Scanner user_in = new Scanner(System.in);  // Scan user input gia na doume an o paikths thelei na dhlwsei tichu


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
    }
}

