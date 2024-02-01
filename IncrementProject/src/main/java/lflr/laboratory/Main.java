package lflr.laboratory;

public class Main {
    public static void main(String[] args){
        GameEntry entry = new GameEntry("Luis", 200);

        Scoreboard scoreboard = new Scoreboard(3);
        scoreboard.add( new GameEntry("Josef", 400));
        scoreboard.add(new GameEntry("Marie", 570));
        scoreboard.add(new GameEntry("Charles", 120));
        scoreboard.print();
    }
}
