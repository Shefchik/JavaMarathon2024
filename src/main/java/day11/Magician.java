package day11;

public class Magician extends Hero implements Healer, MagicAttack, PhysAttack{
    public Magician() {
        super();
        super.setPhysAtt(5);
        super.setMagicAtt(20);
        super.setPhysDef(0);
        super.setMagicDef(80);
        super.setHealHimself(0);
        super.setHealTeammate(0);
    }

    public void healHimself(){
        increaseHealth(getHealHimself());
    }

    public void healTeammate(Hero hero){
        hero.increaseHealth(getHealTeammate());
    }

    @Override
    public String toString() {
        return "{health: " + super.getHealth() + ", physAtt: " + super.getPhysAtt() + ", magicAtt: " + super.getMagicAtt() +
                ", physDef: " + super.getPhysDef() + ", magicDef: " + super.getMagicDef() + "}";
    }

    public void physicalAttack(Hero hero){
        hero.decreaseHealth((int) (super.getPhysAtt() - super.getPhysAtt() * (double)hero.getPhysDef()/100));
    }

    public void magicalAttack(Hero hero){
        hero.decreaseHealth((int) (super.getMagicAtt() - super.getMagicAtt() * (double)hero.getMagicDef()/100));
    }

}
