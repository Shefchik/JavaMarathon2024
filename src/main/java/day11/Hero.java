package day11;

public abstract class  Hero {
    private final static  int MAX_HEALTH = 100;
    private int health;

    private int physAtt;


    private int physDef;
    private int magicDef;

    public void setPhysAtt(int physAtt) {
        this.physAtt = physAtt;
    }



    public int getPhysAtt() {
        return physAtt;
    }



    public void setPhysDef(int physDef) {
        this.physDef = physDef;
    }

    public void setMagicDef(int magicDef) {
        this.magicDef = magicDef;
    }


    public int getPhysDef() {
        return physDef;
    }

    public int getMagicDef() {
        return magicDef;
    }

    public  void decreaseHealth(int health){
        setHealth(Math.max(this.health - health, 0));
    }

    public  void increaseHealth(int health){
        setHealth(Math.min(this.health + health, MAX_HEALTH));
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getHealthStringView() {
        return this.getClass().getName() + "{" + health + "}";
    }

    public Hero() {
        this.health = MAX_HEALTH;
    }

    public abstract String toString();

}
