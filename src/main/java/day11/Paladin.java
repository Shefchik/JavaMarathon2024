package day11;

public class Paladin extends Hero implements PhysAttack, Healer {
    public Paladin() {
        super();
        super.setPhysAtt(15);
        super.setMagicAtt(0);
        super.setPhysDef(50);
        super.setMagicDef(20);
        super.setHealHimself(25);
        super.setHealTeammate(10);
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
                ", physDef: " + super.getPhysDef() + ", magicDef: " + super.getMagicDef() +
                    ", healHimSelf: " + super.getHealHimself() + ", healTeamMate: " + super.getHealTeammate() + "}";
    }

    public void physicalAttack(Hero hero){
        hero.decreaseHealth((int) (super.getPhysAtt() - super.getPhysAtt() * (double)hero.getPhysDef()/100));
    }
}
