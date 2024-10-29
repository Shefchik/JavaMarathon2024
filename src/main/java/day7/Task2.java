package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args){
        Random rnd = new Random();

        Player playerOne = new Player(rnd.nextInt(Player.MAX_STAMINA - 90 + 1) + 90);
        Player playerTwo = new Player(rnd.nextInt( Player.MAX_STAMINA - 90 + 1) + 90);
        Player playerThree = new Player( rnd.nextInt(Player.MAX_STAMINA - 90 + 1) + 90);
        Player playerFour = new Player( rnd.nextInt(Player.MAX_STAMINA - 90 + 1) + 90);
        Player playerFive = new Player(rnd.nextInt(Player.MAX_STAMINA - 90 + 1) + 90);
        Player playerSix = new Player( rnd.nextInt(Player.MAX_STAMINA - 90 + 1) + 90);
        Player.info();
    }
}
