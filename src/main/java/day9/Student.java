package day9;

public class Student extends Human{
    private String groupName;
    public Student(String name, String groupName){
        super(name);
        this.groupName = groupName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + super.getName());
    }

    public String getGroupName() {
        return groupName;
    }
}
