package day11;

public class Warrior extends Hero implements PhysAttack {
    public Warrior() {
        super();
        super.setPhysAtt(30);
        super.setPhysDef(80);
        super.setMagicDef(0);
    }

    @Override
    public String toString() {
        return "{health: " + super.getHealth() + ", physAtt: " + super.getPhysAtt() +
                "physDef: " + super.getPhysDef() + " magicDef: " + super.getMagicDef()+ "}";
    }

}
