public class TaylorSwift extends Enemy{
    private int hp;
private String name;
private int multiplier = 1;
    
    public TaylorSwift(){
        hp = 50;
        name = "Taylor Swift";
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
        int n = (int) (Math.random()*3);
        int m = (int) (Math.random()*5);
        int r = (int) (Math.random()*10);
        if(n==0){
        if(m>0){
        int x = 50*multiplier;
        if(x>100)
        x = 100;
        System.out.println("Taylor Swift sings a face melting song. You lose "+x+" hp.");
        a.loseHp(x);
        multiplier = 1;
        }
        else
        {
        System.out.println("Taylor Swift attempted to sing a song, but her voice cracked.");
        }
        }
        if(n==1){
        if(r>2){
        int d = 25*multiplier;
        if(d>100)
        d = 100;
        System.out.println("Taylor Swift's fans run at you as a stampede. You lose "+d+" hp.");
        a.loseHp(d);
        multiplier = 1;
        }
        else
        {
        System.out.println("Taylor Swift's fans heard her sing Shake it Off, and started dancing instead of attacking you, like they were supposed to.");
        }
        }
        if(n==2){
        if(r>1){
        multiplier *= 2;
        System.out.println("Taylor Swift is shown support from her fans, boosting her self-esteem. This multiplies the power of her next SUCCESSFUL move.\nHer multiplier now equals "+multiplier);
        }
        else
        {
        System.out.println("Taylor Swfit launches both of her private jets to fly at you simultaneously, ramming into you while flying low to the ground. This kills you.");
        a.loseHp(100);
        }
        }
    }
}
