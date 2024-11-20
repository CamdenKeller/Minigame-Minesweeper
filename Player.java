import java.util.Scanner;
public class Player {
Scanner scan = new Scanner(System.in);
private int hp;
private int multiplier = 1;

    public Player(){
        hp = 100;
    }
    
    public void loseHp(int x){
        hp -= x;
        if(hp<0)
        hp = 0; 
    }
    
    public void heal(){
        int x = 20*multiplier;
        if(x>100-hp)
        x = 100-hp;
        hp += 20*multiplier;
        if(hp>100)
        hp = 100;
        System.out.println("You healed for "+x+" hp!");
    }
    
    public void hit(Enemy x){
        x.loseHp(10*multiplier);
        System.out.println("You hit "+x.getName()+" for "+(10*multiplier)+" damage!");
    }
    
    public int getHp(){
        return hp;
    }
    
    public void dMult(){
        multiplier *= 2;
        System.out.println("You multiplied. Your multiplier now equals "+multiplier+".");
    }
    public void rMult(){
        multiplier = 1;
    }
    
    public void showHp(){
        System.out.println("Your hp: "+hp);
    }
}
