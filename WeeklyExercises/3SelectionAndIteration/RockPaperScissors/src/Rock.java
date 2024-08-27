
import java.util.Scanner;
import java.util.Random;

public class Rock
{
   public static void main(String[] args)
   {
      String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay = null;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        //Get player's play -- note that this is stored as a string
        System.out.println("Please enter input R/P/S. \n");
        String input = scan.next().toUpperCase();
        personPlay = input;
        		
        //Generate computer's play (0,1,2)
        computerInt = generator.nextInt(3);
        
        //Translate computer's randomly generated play to string
        switch (computerInt)
        {
        case 0:
        	computerPlay = "R";
        	break;
        
        case 1:
        	computerPlay = "S";
        	break;
        	
        case 2:
        	computerPlay = "P";
        	break;
        }
        
      //Print computer's play
        System.out.println(personPlay);
        System.out.println(computerPlay);

        //See who won.  Use nested ifs instead of &&.
        if (personPlay.equals(computerPlay))  
            System.out.println("It's a tie!");
        
         else if (personPlay.equals("R"))
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors.  You win!!");
         else if (personPlay.equals("R"))
            if (computerPlay.equals("P"))
                System.out.println("Rock loses to paper.  You lose!!");
        
          if (personPlay.equals("P"))
           if (computerPlay.equals("R"))
                 System.out.println("Rock loses to paper.  You win!!");
          if (personPlay.equals("P"))
             if (computerPlay.equals("S"))
                  System.out.println("Paper loses to scissors.  You lose!!");
        
          if (personPlay.equals("S"))
             if (computerPlay.equals("R"))
                 System.out.println("Scissors lose to rock.  You lose!!");
          if (personPlay.equals("S"))
             if (computerPlay.equals("P"))
                 System.out.println("Paper loses to scissors.  You win!!");
        
        
     
            	


   }
}