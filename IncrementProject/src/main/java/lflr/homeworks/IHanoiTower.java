package lflr.homeworks;

import java.util.Stack;
public interface IHanoiTower {

    void move(int fromTower, int toTower);

    void solve(int numDiscs, int originTower, int toTower, int auxTower);
}
