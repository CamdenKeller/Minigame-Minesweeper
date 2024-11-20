import java.util.Scanner;
// Fighting Game

public class BombThree extends Bomb{
    Scanner scan = new Scanner(System.in);
private Enemy x;
   public BombThree(){
       int a = (int) (Math.random()*100) + 1;
       if(a<=5)
       x = new JohnCena();
       if(a>5&&a<=25)
       x = new JackieChan();
       if(a>65&&a<=80)
       x = new WillSmith();
       if(a>25&&a<=35)
       x = new AlanGrant();
       if(a>35&&a<=50)
       x = new Messi();
       if(a>50&&a<=65)
       x = new TaylorSwift();
       if(a>80&&a<=90)
       x = new ElonMusk();
       if(a>90)
       x = new DwayneTheRockJohnson();
   }
   
   
   public void play(){
    scan.nextLine();
    System.out.println("This is a fighting game.");
    scan.nextLine();
    System.out.println("You start at the max health of 100 health points");
    scan.nextLine();
    System.out.println("You have three moves: hit, heal, and multiply");
    scan.nextLine();
    System.out.println("A hit input will deal 10 damage.");
    System.out.println("A heal input will heal you by 20 health points.");
    System.out.println("A multiply input will multiply the damage or healing of your next move by two.");
    scan.nextLine();
    System.out.println("You can stack the multiply input with a subsequent multiply input to further multiply your hit.\nIf you use any move other than multiply, then your stacks of multiply are used on that input (hit or heal), and your multiplier goes back down to 1.");
    scan.nextLine();
    System.out.println();
    System.out.println("For example three uses of the multiply input and then two hit inputs will do the following:\nhit for 80 damage\nhit for 10 damage");
scan.nextLine();
    System.out.println("\nYou are fighting "+x.getName()+"!");
    Player a = new Player();
    System.out.println();
    a.showHp();
    x.showHp();
   scan.nextLine();
    while(a.getHp()>0&&x.getHp()>0){
        System.out.println();
        System.out.println("Input a number (1-3) to indicate your move: \nHit: 1\nHeal: 2\nMultiply: 3");
        int m = scan.nextInt();
        System.out.println();
        if(m==1){
        a.hit(x);
        }
        if(m==2){
        a.heal();
        }
        if(m==3){
        a.dMult();
        }
        if(m!=3){
        a.rMult();
        }
        scan.nextLine();
        System.out.println();
        a.showHp();
        x.showHp();
       // scan.nextLine();
        if(x.getHp()>0){
        System.out.println();
        x.move(a);
        System.out.println();
        a.showHp();
        x.showHp();
        System.out.println();
        scan.nextLine();
        }
    }
    if(x.getHp()>0){
        System.out.println();
        System.out.println("You lost the fight!");
        super.lose();
    }
    else{
        System.out.println();
        System.out.println("You won the fight!\nYou can now move on.\n\n\n");
    }
}
}
