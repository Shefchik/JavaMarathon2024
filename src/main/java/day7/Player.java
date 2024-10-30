package day7;

public class Player {
    private int stamina;
    public static final int NUMBER_OF_PLAYERS = 6;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }

    public void run(){
        if(stamina == 0){
            countPlayers--;
        }else{
            stamina--;
        }
    }
    public static void info(){
        String str;
        if(countPlayers < NUMBER_OF_PLAYERS){
            str = "Команды неполные. На поле еще есть " + (NUMBER_OF_PLAYERS - countPlayers) + " свободных мест";
        }else {
            str =  "На поле нет свободных мест";
        }
        System.out.println(str);
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
}
