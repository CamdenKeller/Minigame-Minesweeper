import java.util.Scanner;
import java.util.ArrayList;
// Trivia
public class BombTwo extends Bomb{
private static ArrayList<String> possibleQuestions = new ArrayList<String>();
private static ArrayList<String> randomizedQuestions = new ArrayList<String>();

public BombTwo(){
    
}

public static void addPossibleQuestions(){
    possibleQuestions.add("Mr Grant worked at Dominoes.F");
    possibleQuestions.add("This assignment will earn a 100%.T");
    possibleQuestions.add("Mr Grant's son is good at basketball.T");
    possibleQuestions.add("Mr Grant is a good teacher.T");
    possibleQuestions.add("Inheritance was useful when creating this project.T");
    possibleQuestions.add("South Africa has 4 capitals.F");
    possibleQuestions.add("Infants have more bones than adults.T");
    possibleQuestions.add("A potato was the first vegetable to be planted on the space shuttle.T");
    possibleQuestions.add("Soccer (futbol) has about 2 billion fans around\nthe world.F");
}

public static void randomize(){
    while(possibleQuestions.size()>0){
        randomizedQuestions.add(possibleQuestions.remove((int)(Math.random()*possibleQuestions.size())));
    }
}


public void play(){
        Scanner scan = new Scanner(System.in);
       System.out.println("Answer the following question with F for false or T for true.");
       String a = randomizedQuestions.remove(0);
       System.out.println(a.substring(0,a.length()-1));
       String x = scan.nextLine().toLowerCase();
       if(x.equals((a.substring(a.length()-1)).toLowerCase())){
        System.out.println("Correct! You can now move on ...\n ");
       return;
       }
       System.out.println("Wrong!");
       super.lose();
    }
}
