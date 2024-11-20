public class JohnCena extends Enemy{

    private int hp;
    private String name = "John Cena";
    
    public JohnCena(){
        hp = 100;
    }
    public void loseHp(int x){
    hp -= x;
        if(hp<0)
        hp = 0;
    }
    
    public int getHp(){
        return hp;
    }
    
    public void showHp(){
        System.out.println(name+"'s hp: "+hp);
    }
    
    public void move(Player a){
    int n = (int) (Math.random()*100);
    if(n>0){
        System.out.println("No one beats John Cena.");
        a.loseHp(100);
    }
    else{
        System.out.println("By a miracle John Cena has chosen to spare you.");
        loseHp(100);
    }
    }
    
    public String getName(){
        return name;
    }
}
