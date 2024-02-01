package lflr.laboratory;

public class GameEntry {
    public final String name;
    public final int score;

    public GameEntry(String name, int score){
        this.name = name;
        this.score = score;
    }
    public String toString(){
        return score + " - " + name;
    }
}
