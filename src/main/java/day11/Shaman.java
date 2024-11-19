package day11;


public class Shaman extends Hero implements  Healer, MagicAttack, PhysAttack {
    public Shaman() {
        super();
        super.setPhysAtt(10);
        super.setMagicAtt(15);
        super.setPhysDef(20);
        super.setMagicDef(20);
        super.setHealHimself(50);
        super.setHealTeammate(30);
    }

    public void healHimself() {
        increaseHealth(getHealHimself());
    }

    public void healTeammate(Hero hero) {
        hero.increaseHealth(getHealTeammate());
    }

    @Override
    public String toString() {
        return "{health: " + super.getHealth() + ", physAtt: " + super.getPhysAtt() + ", magicAtt: " + super.getMagicAtt() +
                ", physDef: " + super.getPhysDef() + ", magicDef: " + super.getMagicDef() +
                ", healHimSelf: " + super.getHealHimself() + ", healTeamMate: " + super.getHealTeammate() + "}";
    }

    public void physicalAttack(Hero hero){
        hero.decreaseHealth((int) (super.getPhysAtt() - super.getPhysAtt() * (double)hero.getPhysDef()/100));
    }

    public void magicalAttack(Hero hero){
        hero.decreaseHealth((int) (super.getMagicAtt() - super.getMagicAtt() * (double)hero.getMagicDef()/100));
    }

}