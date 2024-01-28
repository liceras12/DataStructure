package lflr.laboratorys;

public class Scoreboard {
    private GameEntry[] board;

    public Scoreboard(int capacity){
        board = new GameEntry[capacity];
    }

    public void add(GameEntry entry){
            for (int i = 0; i < board.length; i++){
                 if (board[i] == null){
                     board[i] = entry;
                     break;
                 }

                 if (entry.score > board[i].score){
                     for ( int j = board.length - 1; j > i; j--){
                         board[j] = board[j - 1];
                     }
                     board[i] = entry;
                     break;
                 }
            }
    }

    public void print(){
        for (var gameEntry : board){
            System.out.println(gameEntry);
        }
    }
}
