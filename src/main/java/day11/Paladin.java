package day11;

public class Paladin extends Hero implements PhysAttack {

    private int healHimself;
    private int healTeammate;

    public Paladin() {
        super();
        super.setPhysAtt(15);
        super.setPhysDef(50);
        super.setMagicDef(20);
        setHealHimself(25);
        setHealTeammate(10);
    }
    public void healHimself(){
        increaseHealth(getHealHimself());
    }

    public void healTeammate(Hero hero){
        hero.increaseHealth(getHealTeammate());
    }

    @Override
    public String toString() {
        return "{health: " + super.getHealth() + ", physAtt: " + super.getPhysAtt() +
                ", physDef: " + super.getPhysDef() + ", magicDef: " + super.getMagicDef() +
                    ", healHimSelf: " + getHealHimself() + ", healTeamMate: " + getHealTeammate() + "}";
    }

    public void physicalAttack(Hero hero){
        hero.decreaseHealth((int) (super.getPhysAtt() - super.getPhysAtt() * (double)hero.getPhysDef()/100));
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
