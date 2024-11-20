public class Messi extends Enemy{
    private int hp;
private String name;
private int multiplier = 1;
    
    public Messi(){
        hp = 80;
        name = "Lionel Messi";
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
        int m = (int) (Math.random()*3);
        int r = (int) (Math.random()*10);
        if(n==0){
        if(m>0){
        int x = 50*multiplier;
        if(x>100)
        x = 100;
        System.out.println("Messi kicks a soccer ball into your chest. You lose "+x+" hp.");
        a.loseHp(x);
        multiplier = 1;
        }
        else
        {
        System.out.println("Messi kicked a soccer ball at your chest but missed.");
        }
        }
        if(n==1){
        if(r>2){
        int d = 35*multiplier;
        if(d>100)
        d = 100;
        System.out.println("Messi headbutts you. You lose "+d+" hp.");
        a.loseHp(d);
        multiplier = 1;
        }
        else
        {
        System.out.println("Messi tries to headbutt you, but you dodge it.");
        }
        }
        if(n==2){
        if(r>1){
        multiplier *= 2;
        System.out.println("Messi is beginning to rage. This multiplies the power of his next SUCCESSFUL move.\nHis multiplier now equals "+multiplier);
        }
        else
        {
        System.out.println("Messi started getting aggressive. He got a red card and is ejected from the fight.");
        hp = 0;
        }
        }
    }
}
