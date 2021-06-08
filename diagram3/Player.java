package diagram3;
public class Player {
    public boolean acceptance,acceptance_rest;
    public boolean understanding,understanding_rest;
    public boolean tichu,grand_tichu;
    
    public Player(){
        acceptance=false;
        acceptance_rest=false;
        understanding=false;
        understanding_rest=false;
        tichu=false;
        grand_tichu=false;
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
    

    //apla gia debuging, den einai oti xreiazetai na ta emfanizoume ston xrhsth
    public void printState() {
        System.out.println("Acceptancce="+acceptance);
        System.out.println("Understanding="+understanding);
        System.out.println("Acceptancce_rest="+acceptance_rest);
        System.out.println("Understanding_rest="+understanding_rest);
        
    }
      // proshiki kwdika gia tin antallagi fullwn 8/6/2021
    public void send_card_teamate() {
        //apostoli fulou ston simpexti
    }
    public void recive_card_teamate() {
        //paralabi fulou  simpexti
    }
    public void send_card_right() {
        //apostoli fulou ston dexia pexti
    }
    public void recive_card_right() {
         //paralabi fulou  dexia pexti
    }
    public void send_card_left() {
        //apostoli fulou ston aristera pexti
    }
    public void recive_card_left() {
         //paralabi fulou  aristera pexti
    }
        // proshiki kwdika gia tis kiniseis sto paixnidi 8/6/2021
    public void ask_for_card(){
        // apaiti tin uparxei majong kai na tin rixnei o paixtis stin arxi
    }
    public void drop_cards()
    {
        // riximo kartas oi kartwn apo ton paixti 
    }
    public void collect_cards()
    {
        // maze ton kartwn apo ton paixti me tin proipothesi oti exoun paei oi alloi paso
    }
    public void fold()
    {
        // o paixtis paei paso stin seira tou
    }
    public void drop_bomb()
    {
        // o paixtis kanei xrisi tis bombas tou 
    }
    // proshiki kwdika gia xrisi dragon kai skilwn sto paixnidi 8/6/2021
    public void use_dragon()
    {
        // periptwsi xrisis 6 xrisi drakou aparaititi sinartisi
    }
    public void use_dog()
    {
        // periptwsi xrisis 7 xrisi dog aparaititi sinartisi
    }
    public void give_collected_cards()
    {
        // periptwsi xrisis 6 xrisi drakou aparaititi sinartisi
    }
}

