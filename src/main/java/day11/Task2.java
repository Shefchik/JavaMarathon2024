package day11;

public class Task2 {
    public static void main(String[] args){
        Warrior warrior =  new Warrior();
        Paladin paladin = new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
        System.out.println(paladin.getHealthStringView());
        paladin.physicalAttack(magician);
        System.out.println(magician.getHealthStringView());
        shaman.healTeammate(magician);
        System.out.println(magician.getHealthStringView());
        magician.magicalAttack(paladin);
        System.out.println(paladin.getHealthStringView());
        shaman.physicalAttack(warrior);
        System.out.println(warrior.getHealthStringView());
        paladin.healHimself();
        System.out.println(paladin.getHealthStringView());
        for(int counter = 0; counter < 5; counter++){
            warrior.physicalAttack(magician);
            System.out.println(magician.getHealthStringView());
        }
    }
}
