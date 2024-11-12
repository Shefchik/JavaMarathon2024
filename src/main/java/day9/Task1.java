package day9;

public class Task1 {
    public static void main(String[] args){
        Student student = new Student("Игорь", "Группа №1");
        Teacher teacher = new Teacher("Павел", "Физика");
        student.printInfo();
        teacher.printInfo();
    }
}
