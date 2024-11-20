import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        BombTwo.addPossibleQuestions();
        BombTwo.randomize();
        System.out.println("Hello! Welcome to Minigame Minesweeper!\nMinesweeper but with a twist! \n\nWarnings: \n-When asked to input a valid integer, input a valid integer\n-When asked to input a valid string, input a valid string\n-If you fail at this, it is your fault and the game ends\n-You shouldn't be that bad at typing\n\nIf you run into a bomb, you may have the opportunity to play a minigame. \nIf you win the minigame, you continue playing. \nIf you lose the minigame, you lose it all!\n\nThere will also be a 3% chance with every bomb that it immediately ends your game. \nNo second chances.\nTough luck. \nWe call this bomb ... the sUpEr BoMb :( \nBy the way each 3x3 chunk contains 4 bombs\n\nLet the (mini)games begin!\n");
        Board a = new Board();
        while(!a.win()&&!a.getLose()){
            System.out.println(a.getGameBoard());
            System.out.println("Row: ");
            int row =  scan.nextInt();
            System.out.println("Column: ");
            int col = scan.nextInt();
            System.out.println();
            Bomb b = new Bomb();
            int d = (int) (Math.random()*100+1);
            if(a.getNum(row,col)==0){
                a.changeGameBoard1(row,col);
            }
            if(a.getNum(row,col)==1)
            {
               if(d<=3){
                System.out.println("You have hit a sUpErBoMb!\n\nYou lost the game! :(\n\nBetter luck next time!");
                Board.changeLose();
                return;
            }
               System.out.println("\nYou hit a bomb! \n...\nWin rock paper scissors to stay in the game.");
               b = new BombOne();
               b.play();
               a.changeGameBoard2(row,col);
            }
            if(a.getNum(row,col)==2)
            {
                if(d<=3){
                System.out.println("You have hit a sUpErBoMb!\n\nYou lost the game! :(\n\nBetter luck next time!");
                Board.changeLose();
                return;
            }
               System.out.println("\nYou hit a bomb :( \n... \nAnswer a trivia question correctly to continue.");
               b = new BombTwo();
               b.play();
               a.changeGameBoard2(row,col);
            }
            if(a.getNum(row,col)==3)
            {
                if(d<=3){
                System.out.println("You have hit a sUpErBoMb!\n\nYou lost the game! :(\n\nBetter luck next time!");
                Board.changeLose();
                return;
            }
                 System.out.println("You hit a fighting bomb.\nPress ENTER each time to progress through the instructions");
                 b = new BombThree();
                 b.play();
                 a.changeGameBoard2(row,col);
            }
        }
        if(a.getLose()){
            System.out.println();
            System.out.println("You lost the game! :(\n\nBetter luck next time!");
        }
        else{
            System.out.println();
            System.out.println("You won the game! :)\nGood job!\nYou are a good person now!");
        }
    }
}
