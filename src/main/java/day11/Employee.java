package day11;

public class Employee {
    private String fIo;
    private String birthDate;
    private int salary;
    private boolean isPayed;

    private WareHouse wareHouse;

    public Employee(String fIo, String birthDate, int salary, boolean isPayed, WareHouse wareHouse) {
        this.fIo = fIo;
        this.birthDate = birthDate;
        this.salary = salary;
        this.isPayed = isPayed;
        this.wareHouse = wareHouse;
    }

    public String getfIo() {
        return fIo;
    }

    public void setfIo(String fIO) {
        this.fIo = fIO;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public void setIsPayed(boolean isPayed) {
        this.isPayed = isPayed;
    }

    public String toString(){
        return "ФИО: " + this.fIo + ", Дата Рождения: " + this.birthDate + ", заработная плата: " + this.salary + ", был выплачен бонус или нет: " + isPayed;
    }

    public WareHouse getWareHouse() {
        return wareHouse;
    }

    public void setWareHouse(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }
}
