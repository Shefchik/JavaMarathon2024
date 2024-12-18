package day9;

public class Teacher extends Human{
    private String subjectName;
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + super.getName());
    }
    public Teacher(String name, String subjectName){
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }
}
