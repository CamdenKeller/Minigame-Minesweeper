public class DwayneTheRockJohnson extends Enemy{
    private int hp;
private String name;
    
    public DwayneTheRockJohnson(){
        hp = 300;
        name = "Dwayne \"The Rock\" Johnson";
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
        int d = 6;
        int n = (int) (Math.random()*2);
        int m = (int) (Math.random()*3);
        int r = (int) (Math.random()*d);
        if(n==0){
        if(r==0){
        System.out.println("The Rock punches you in the chest. You die.");
        a.loseHp(100);
        }
        else
        {
        System.out.println("The Rock attempts to punch you in the chest. He misses.");
        }
        }
        if(n==1){
        if(m>0){
        System.out.println("The Rock drinks a Zoa Energy drink. The precision of his punch is now increased.");
        if(d>1)
        d-=1;
        r = (int) (Math.random()*d);
        }
        else
        {
        System.out.println("The Rock does not make a move. He was busy filming Moana 2.");
        }
        }
    }
}
