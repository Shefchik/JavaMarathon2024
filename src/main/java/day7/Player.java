package day7;

public class Player {
    int stamina;
    public static final int NUMBER_OF_PLAYERS = 6;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 1;
    public static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
    }

    public void run(){
        stamina--;
        if(stamina == 0){
            countPlayers--;
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
    /*
    * Поле “выносливость” (англ. stamina), разное для каждого экземпляра, инициализируется через конструктор.
Константы “максимальная выносливость” (англ. MAX_STAMINA) со значением 100 и “минимальная выносливость” (англ. MIN_STAMINA)
* со значением 0, единые для всех экземпляров.
Статическое поле countPlayers, которое считает количество игроков на футбольном поле (изначально их 0,
*  выходом на поле считается создание экземпляра класса, уходом - когда игрок устал).
Геттеры для полей “выносливость” и “количество игроков”.

    * */
}
