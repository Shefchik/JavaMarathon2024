package day11;

public class Warrior extends Hero implements PhysAttack {
    public Warrior() {
        super();
        super.setPhysAtt(30);
        super.setMagicAtt(0);
        super.setPhysDef(80);
        super.setMagicDef(0);
        super.setHealHimself(0);
        super.setHealTeammate(0);
    }

    @Override
    public String toString() {
        return "{health: " + super.getHealth() + ", physAtt: " + super.getPhysAtt() + ", magicAtt: " + super.getMagicAtt() +
                "physDef: " + super.getPhysDef() + " magicDef: " + super.getMagicDef()+ "}";
    }

    public void physicalAttack(Hero hero){
        hero.decreaseHealth((int) (super.getPhysAtt() - super.getPhysAtt() * (double)hero.getPhysDef()/100));
    }
}
