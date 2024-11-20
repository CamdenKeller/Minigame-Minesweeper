import java.util.Scanner;
// Rock Paper Scissors
public class BombOne extends Bomb{
    Scanner scan = new Scanner(System.in);
   public BombOne(){
     
   }
   
   
   public void play(){
       String x = "";
       String y = "";
       System.out.println("Enter your choice of Rock, Paper, or Scissors using the\ncorresponding indiviudal character R, P, or S:");
       String input = scan.nextLine().toLowerCase();
       int computer = (int) (3*Math.random());
       String computerVal = "";
       if(computer == 0)
       {
           computerVal = "r";
       }
       if(computer == 1)
       {
           computerVal = "p";
       }
              if(computer == 2)
       {
           computerVal = "s";
       }
       while(computerVal.equals(input))
       {
          if(computerVal.equals("r"))
          {
              x = "Rock";
              y = "Rock";
          }
          if(computerVal.equals("p"))
          {
              x = "Paper";
              y = "Paper";
          }
          if(computerVal.equals("s"))
          {
              x = "Scissors";
              y = "Scissors";
          }
          System.out.println("User: " + y);
          System.out.println("Computer: " + x);
           System.out.println("Tie! Try again \nEnter your choice of Rock, Paper, or Scissors using the corresponding \nindiviudal character R, P, or S");

       input = scan.nextLine().toLowerCase();
    computer = (int) (3*Math.random());
    if(computer == 0)
       {
           computerVal = "r";
       }
       if(computer == 1)
       {
           computerVal = "p";
       }
              if(computer == 2)
       {
           computerVal = "s";
       }
      
       }
        System.out.println();
       if(computerVal.equals("s") && input.equals("p"))
       {
           x = "Scissors";
           y = "Paper";
           System.out.println("User: " + y);
          System.out.println("Computer: " + x);
            super.lose();
       }
        if(computerVal.equals("r") && input.equals("s"))
       {
           x = "Rock";
           y = "Scissors";
           System.out.println("User: " + y);
          System.out.println("Computer: " + x);
           super.lose();
       }
           if(computerVal.equals("p") && input.equals("r"))
       {
           x = "Paper";
           y = "Rock";
           System.out.println("User: " + y);
          System.out.println("Computer: " + x);
           super.lose();
       }
            if(computerVal.equals("s") && input.equals("r"))
       {
                      x = "Scissors";
           y = "Rock";
           System.out.println("User: " + y);
          System.out.println("Computer: " + x);
            System.out.println("You won! You can now move on ... ");
           return;
       }
              if(computerVal.equals("p") && input.equals("s"))
       {
                      x = "Paper";
           y = "Scissors";
           System.out.println("User: " + y);
          System.out.println("Computer: " + x);
           System.out.println("You won! You can now move on ...");
           return;
       }
               if(computerVal.equals("r") && input.equals("p"))
       {
                      x = "Rock";
           y = "Paper";
           System.out.println("User: " + y);
          System.out.println("Computer: " + x);
            System.out.println("You won! You can now move on ...");
            System.out.println();
           return;
       }
            if(!input.equals("r") || !input.equals("p") ||!input.equals("s")){
                super.lose();
            }
       
       
       
   }
}
