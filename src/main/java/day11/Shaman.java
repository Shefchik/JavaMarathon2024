package day11;


public class Shaman extends Hero implements  Healer, MagicAttack, PhysAttack {
    private int magicAtt;
    private int healHimself;
    private int healTeammate;

    public Shaman() {
        super();
        super.setPhysAtt(10);
        setMagicAtt(15);
        super.setPhysDef(20);
        super.setMagicDef(20);
        setHealHimself(50);
        setHealTeammate(30);
    }

    public void healHimself() {
        increaseHealth(getHealHimself());
    }

    public void healTeammate(Hero hero) {
        hero.increaseHealth(getHealTeammate());
    }

    @Override
    public String toString() {
        return "{health: " + super.getHealth() + ", physAtt: " + super.getPhysAtt() + ", magicAtt: " + getMagicAtt() +
                ", physDef: " + super.getPhysDef() + ", magicDef: " + super.getMagicDef() +
                ", healHimSelf: " + getHealHimself() + ", healTeamMate: " + getHealTeammate() + "}";
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

    public int getHealHimself() {
        return healHimself;
    }

    public int getHealTeammate() {
        return healTeammate;
    }

    public void setHealHimself(int healHimself) {
        this.healHimself = healHimself;
    }

    public void setHealTeammate(int healTeammate) {
        this.healTeammate = healTeammate;
    }
}