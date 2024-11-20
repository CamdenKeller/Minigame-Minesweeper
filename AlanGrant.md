'''javascript
public class AlanGrant extends Enemy{
       
private int hp;
private String name;
    
    public AlanGrant(){
        hp = 15;
        name = "Mr. Grant";
    }
    
    public void loseHp(int x){
    hp -= x;
        if(hp<0)
        hp = 0;
    }
    
    public int getHp(){
        return hp;
    }
    
    public String getName(){
    return name;
    }
    
    public void showHp(){
        System.out.println(name+"'s hp: "+hp);
    }
    
    public void move(Player a){
        int n = (int)(Math.random()*50)+51;
        if(n>=75){
        System.out.println("Mr. Grant is not here to fight. He is here to judge you by giving you a grade. Anything at 75% or above is a pass. You have earned a "+n+"%. You have passed.");
        hp=0;
        }
        else{
        System.out.println("Mr. Grant is not here to fight. He is here to judge you by giving you a grade. Anything at 75% or above is a pass. You have earned a "+n+"%. You have failed.");
        a.loseHp(100);
        }
    } 
}
'''
