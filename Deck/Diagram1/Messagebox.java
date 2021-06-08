public class Messagebox
{
    // i sinartisi ektipwnei to minima epitiximenis apostolis | liyis
    public void print_messagebox(int x)
    {
        // gia x = 0 ektipwnei to minima 1
        // oti o paixtis esteile ta filla kai perimenei
        // gia x = 1 ektipwnei to minima 2
        // oti o paixtis prepei na apodexti ta filla pou tou stelnoun oi alloi
        if(x == 0)
        {
            System.out.println("You are waiting other players finish the trade\n");
        }
        else
        {
            System.out.println("Other player are waiting you to take your cards\n");
        }
    }
    //i sinartisi tha prepei na ektipwnei minima apodoxis ston xristi
     public void press_done()
    {
        
    }
    //ligo prin tin lixi tou xronou antalagis kalite to minima proidopoiseis
    public void print_warning()
    {
        System.out.println("You have to finish trading hurry up!\n");
    }
    // minima gia epitiximeni proshiki filou
    public void friend_add_msg()
    {
         System.out.println("You have add a new friend!\n");
    }
    // erwtisi gia prosthiki filou
    public void print_add_friend_msg()
    {
        System.out.println("Do you want to add friend?\n");
    }
}
