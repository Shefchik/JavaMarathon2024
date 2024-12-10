package day11;

public class Magician extends Hero implements  MagicAttack, PhysAttack{
    private int magicAtt;

    public Magician() {
        super();
        super.setPhysAtt(5);
        setMagicAtt(20);
        super.setPhysDef(0);
        super.setMagicDef(80);

    }


    @Override
    public String toString() {
        return "{health: " + super.getHealth() + ", physAtt: " + super.getPhysAtt() + ", magicAtt: " + getMagicAtt() +
                ", physDef: " + super.getPhysDef() + ", magicDef: " + super.getMagicDef() + "}";
    }


    public void magicalAttack(Hero hero){
        hero.decreaseHealth((int) (getMagicAtt() - getMagicAtt() * (double)hero.getMagicDef()/100));
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
    }
}
