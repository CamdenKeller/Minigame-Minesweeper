public class ElonMusk extends Enemy{
 private int hp;
private String name;
    
    public ElonMusk(){
        hp = 200;
        name = "Elon Musk";
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
        if(m>1){
        System.out.println("Elon has a self-driving car run you over. You lose 70 hp.");
        a.loseHp(70);
        }
        else
        {
        System.out.println("Elon attempts to have a self driving car run you over, but the code malfunctions.");
        }
        }
        if(n==1){
        if(r>2){
        System.out.println("Elon throws a brick at you. You lose 25 hp.");
        a.loseHp(25);
        }
        else
        {
        System.out.println("Elon throws a can of soup at you. You lose 5 hp.");
        a.loseHp(5);
        }
        }
        if(n==2){
        if(r>1){
        System.out.println("Elon is not afraid of you. He sits back in his chair and does nothing.");
        }
        else
        {
        System.out.println("Elon implants a chip in your brain that shuts you down like a robot after forcing your limbs to do a dance.");
        a.loseHp(100);
        }
        }
    }   
}
