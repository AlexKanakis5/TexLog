package diagram2;
public class Player {
    public boolean acceptance,acceptance_rest;
    public boolean understanding,understanding_rest;
    public boolean tichu,grand_tichu;

    private int points; //den exoume ftiaksei kati poy na ypologizei ousiastika tous pontous toy kathe paikth 
    //parakatw yparxei h calcpoints poy kai kala ypologizei tous pontous tous kathe paikth (poy exei mazepsei ap ta xartia)
    //tous pontous toy tichu kai toy grand tous ypologizoume sto object Team, klash TeamScore()


    public Player(){
        acceptance=false;
        acceptance_rest=false;
        understanding=false;
        understanding_rest=false;
        tichu=false;
        grand_tichu=false;
        points=0;
    }
    

    //oi metablhthes acceptance kai understaing einai symbolikes, molis ginei to prwto moirasma kai oi dyo ginontai aytomata true
    public void acceptCards() {
        acceptance=true;
    }
    
    public void understandCards() {
        understanding=true;
    }  
    

    //an o paikths pathsei to "koumpi" grand (poy den exei ylopoihthei,ayto einai ena megalo kommati) tote gineetai true 
    //tha prepei na pairnei parapanw pontous an nikhsei me ayth th metablhth = true
    public void grand_tichu() {
        grand_tichu=true;        
        System.out.println("grand_tichu="+grand_tichu);
        System.out.println("\nOne player chose grand tichu\n");
        
    }
    

    //oi acceptRestCards kai understand_rest einai epishs symbolikes
    public void acceptRestCards() {
        acceptance_rest=true;
    }
    
    public void understandingRestCards() {
        understanding_rest=true;
    }
    
    //to idio me to grand_tichu
    public void tichu() {
        tichu=true;
        System.out.println("\nOne player chose tichu\n");
        //System.out.println("tichu="+tichu);
    }
    
    //h getpoints tha ypologizei tous pontous toy kathe paikth 
    //pros to paron exw balei apla oti pairnei 50 gia na epistrefei kati 
    public int calcpoints()
    {
        points=50;
        return points;
    }


    //apla gia debuging, den einai oti xreiazetai na ta emfanizoume ston xrhsth
    public void printState() {
        System.out.println("Acceptancce="+acceptance);
        System.out.println("Understanding="+understanding);
        System.out.println("Acceptancce_rest="+acceptance_rest);
        System.out.println("Understanding_rest="+understanding_rest);
        
    }
}

