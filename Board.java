public class Board {
private int[][] numBoard = new int[9][9];
private String[][] gameBoard = new String[9][9];
private static boolean lose = false;

public Board(){
    int numSelect = randomIntList();
    for(int i = 0; i<9; i+=3){
        int x = randomIntList();
        for(int j = 0; j<3; j++){
            for(int k = 0; k<3; k++){
                numBoard[j][i+k]=x%10;
                x /= 10;
            }
        }
        x = randomIntList();
        for(int j = 3; j<6; j++){
            for(int k = 0; k<3; k++){
                numBoard[j][i+k]=x%10;
                x /= 10;
            }
        }
        x = randomIntList();
        for(int j = 6; j<9; j++){
            for(int k = 0; k<3; k++){
                numBoard[j][i+k]=x%10;
                x /= 10;
            }
        }
    }
    for(int i = 0; i<numBoard.length; i++){
       for(int j = 0; j<numBoard[i].length; j++){
           if(numBoard[i][j]==4)
           numBoard[i][j]=3;
           if(numBoard[i][j]>3)
           numBoard[i][j]=0;
       }
   }
    for(int i = 0; i<gameBoard.length; i++){
       for(int j = 0; j<gameBoard[i].length; j++){
           gameBoard[i][j]="-";
       }
   }
}

public int randomIntList(){
    int i = (int) (9*Math.random())+1;
    for(int j=0; j<8; j++){
        int a = (int) (9*Math.random())+1;
        while(includes(i, a)){
            a = (int) (9*Math.random())+1;
        }
        i *= 10;
        i += a;
    }
    return i;
}

public boolean includes(int n, int i){
    while(n>0){
        if(n%10==i)
        return true;
        n/=10;
    }
    return false;
}

public String getNumBoard(){
    String y = "";
   for(int i = 0; i<numBoard.length; i++){
       for(int j = 0; j<numBoard[i].length; j++){
           y += numBoard[i][j] + " ";
       }
       y += "\n";
   }
   return y;
}

public String getGameBoard(){
    String y = "  0 1 2 3 4 5 6 7 8\n";
   for(int i = 0; i<gameBoard.length; i++){
       y += i + " ";
       for(int j = 0; j<gameBoard[i].length; j++){
           y += gameBoard[i][j] + " ";
       }
       y += "\n";
   }
   return y;
}

public int bombCount(int a, int b){
    int c = 0; 
    if(a>0&&a<8&&b>0&&b<8){
        if(numBoard[a-1][b-1]!=0)
        c++;
        if(numBoard[a-1][b]!=0)
        c++;
        if(numBoard[a-1][b+1]!=0)
        c++;
        if(numBoard[a][b-1]!=0)
        c++;
        if(numBoard[a][b+1]!=0)
        c++;
        if(numBoard[a+1][b-1]!=0)
        c++;
        if(numBoard[a+1][b]!=0)
        c++;
        if(numBoard[a+1][b+1]!=0)
        c++;
        return c;
    }
    if(a==0&&b==0){
        if(numBoard[a][b+1]!=0)
        c++;
        if(numBoard[a+1][b]!=0)
        c++;
        if(numBoard[a+1][b+1]!=0)
        c++;
        return c;
    }
    if(a==0&&b==8){
        if(numBoard[a][b-1]!=0)
        c++;
        if(numBoard[a+1][b-1]!=0)
        c++;
        if(numBoard[a+1][b]!=0)
        c++;
        return c;
    }
    if(a==8&&b==0){
       if(numBoard[a][b+1]!=0)
        c++; 
        if(numBoard[a-1][b]!=0)
        c++;
        if(numBoard[a-1][b+1]!=0)
        c++;
        return c;
    }
    if(a==8&&b==8){
        if(numBoard[a-1][b-1]!=0)
        c++;
        if(numBoard[a][b-1]!=0)
        c++;
        if(numBoard[a-1][b]!=0)
        c++;
        return c;
    }
    if(a==0){
        if(numBoard[a][b-1]!=0)
        c++;
        if(numBoard[a][b+1]!=0)
        c++;
        if(numBoard[a+1][b-1]!=0)
        c++;
        if(numBoard[a+1][b]!=0)
        c++;
        if(numBoard[a+1][b+1]!=0)
        c++;
        return c;
    }
    if(a==8){
        if(numBoard[a][b-1]!=0)
        c++;
        if(numBoard[a][b+1]!=0)
        c++;
        if(numBoard[a-1][b-1]!=0)
        c++;
        if(numBoard[a-1][b]!=0)
        c++;
        if(numBoard[a-1][b+1]!=0)
        c++;
        return c;
    }
    if(b==0){
        if(numBoard[a-1][b]!=0)
        c++;
        if(numBoard[a+1][b]!=0)
        c++;
        if(numBoard[a-1][b+1]!=0)
        c++;
        if(numBoard[a][b+1]!=0)
        c++;
        if(numBoard[a+1][b+1]!=0)
        c++;
        return c;
    }
    if(b==8){
        if(numBoard[a-1][b]!=0)
        c++;
        if(numBoard[a+1][b]!=0)
        c++;
        if(numBoard[a-1][b-1]!=0)
        c++;
        if(numBoard[a][b-1]!=0)
        c++;
        if(numBoard[a+1][b-1]!=0)
        c++;
        return c;
    }
    return c;
}

public boolean win(){
    int c = 0;
    boolean w = false;
    for(int i = 0; i<gameBoard.length; i++){
       for(int j = 0; j<gameBoard[i].length; j++){
           if(!gameBoard[i][j].equals("-")&&!gameBoard[i][j].equals("X"))
           c++;
       }
   }
   if(c==45)
   w = true;
   return w;
}

public boolean getLose(){
    return lose;
}

public void changeGameBoard1(int a, int b){
    String x = ""+bombCount(a,b);
    gameBoard[a][b]=x;
}

public void changeGameBoard2(int a, int b){
    gameBoard[a][b]="X";
}

public static void changeLose(){
    {
        lose = true;
    }
}
 
public int getNum(int a, int b){
    return numBoard[a][b];
}   
}
