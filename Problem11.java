import java.util.*;

class Problem11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator{
  
  public int compare(Object a, Object b){
    Player player1 = (Player) a;
    Player player2 = (Player) b;
    
    int p1score = player1.score;
    int p2score = player2.score;
    
    String p1name = player1.name;
    String p2name = player2.name;
    
    if (p1score == p2score)     
      return p1name.compareTo(p2name);
    else if(p1score < p2score)
      return 1;
    else
      return -1;
  }
}
