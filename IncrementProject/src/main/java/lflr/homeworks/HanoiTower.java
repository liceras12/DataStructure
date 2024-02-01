package lflr.homeworks;

import java.util.Stack;

public class HanoiTower implements IHanoiTower{
    private Stack<Integer>[] towers;
    public static int count = 1;

    public HanoiTower(int numDiscs) {
        towers = new Stack[3];
        for (int i = 0; i < 3; i++) {
            towers[i] = new Stack<>();
        }
        for (int i = numDiscs; i >= 1; i--) {
            towers[0].push(i);
        }
    }

    @Override
    public void move(int originTower, int toTower) {
        towers[toTower].push(towers[originTower].pop());
        String prevTower = null;
        String nextTower = null;
        if (originTower == 0){
            prevTower = "Origin";
        }
        if (originTower == 1){
            prevTower = "Auxiliary";
        }
        if (originTower == 2){
            prevTower = "Destiny";
        }
        if (toTower == 0){
            nextTower = "Origin";
        }
        if (toTower == 1){
            nextTower = "Auxiliary";
        }
        if (toTower == 2){
            nextTower = "Destiny";
        }
        System.out.println(count++ + ": Move disk " + towers[toTower].peek() + " from Tower " + prevTower + " to Tower " + nextTower);
    }

    @Override
    public void solve(int numDiscs, int originTower, int toTower, int auxTower) {
        if (numDiscs == 1) {
            move(originTower, toTower);
        } else {
            solve(numDiscs - 1, originTower, auxTower, toTower);
            move(originTower, toTower);
            solve(numDiscs - 1, auxTower, toTower, originTower);
        }
    }
    public int getMovement(){
        return count-1;
    }
}
