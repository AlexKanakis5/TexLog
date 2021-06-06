package diagram2;

// prepei na ftiaksoume methodo gia na ypologizoume tous pontous poy exei mazepsei o kathenas ap th mpaza tou

public class Team {
    private Player p1;
    private Player p2;
    private int score;

    public Team (Player p_1,Player p_2)
    {
        this.p1=p_1;
        this.p2=p_2;
        this.score=0;
    }

    public int TeamScore(boolean team_won)
    {
        //h calcpoints()  einai klash sto Player.java
        //pros to paron den ypologizei kati apla epistrefei 50

        int points = 0;
        if (team_won)
        {
            if (p1.grand_tichu || p2.understanding)
            {
                
                points += 200; //200 pontous apo to grand 
                points = p1.calcpoints() + p2.calcpoints(); //+tous pontous tou kathe paikth 

            }//end grand
            
            if (p1.tichu || p2.tichu)
            {

                points += 100; //100 pontous apo to tichu
                points = p1.calcpoints() + p2.calcpoints(); //+tous pontous tou kathe paikth 

            }//end tichu
        }//end team won

        else
        {
            if (p1.grand_tichu || p2.understanding)
            {

                points -= 200; //-200 pontous epeidh exasan alla eipan grand 
                points = p1.calcpoints() + p2.calcpoints(); //+tous pontous tou kathe paikth 

            }//end grand
            
            if (p1.tichu || p2.tichu)
            {
                
                points -= 100; //-100 pontous epeidh exasan alla eipan tichu
                points = p1.calcpoints() + p2.calcpoints(); //+tous pontous tou kathe paikth 

            }//end tichu

        }//end team lose 
        
        return points;
    }//end TeamScore

}


