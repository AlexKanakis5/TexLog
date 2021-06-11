public class Registration
{
    // μεταβλητές στιγμιοτύπου - αντικαταστήστε το ακόλουθο παράδειγμα
    // με τις δικές σας μεταβλητές
    private boolean registration_period;

  
  

   
    public void start_regist()
    {
        // auti i sinartisi prepei na ekteleitai prwti apo oles 
      System.out.println("\nWe start the new Tournament! \n");
      System.out.println("\nThe regist session will be open for 10 days \n");
      
      // enarxi eggrafwn
      registration_period = true;
    }
     public void end_regist()
    {
        //
      
        System.out.println("\nThe regist session will now end \n");
        // lixi eggrafwn
       registration_period = false;
    }
    public void new_regist()
    {
        //
      
       System.out.println("\nThe regist session will now extend for 5 days \n");
      // enarxi eggrafwn
      registration_period = true;
    }
    public void regist()
    {
      //gia kathe mia eggrafi tha elenxei an iparxei anoixti periodos eggrafwn
      // an den uparxei tha ektipwnei antistoixw minima
      
      if (registration_period == true)
      {
          // se auto to simeio prepei na oristei kapou enas pinakas apo paixtes
          // kai kathe fora na kanei eggrafi enos akoma
          Player p_1=new Player();
          System.out.println("\nThe regist is done welcome new player \n");
      }
      else
      {
          System.out.println("\nThe regist isn't done no regist period available \n");  
      }
      
      
    }
}
