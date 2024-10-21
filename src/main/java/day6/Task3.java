package day6;

public class Task3 {
    public static void main(String[] args){
        Teacher teacher = new Teacher("Чудинов Виталий Владимирович", "Программирование");
        Student student = new Student("Краснов Алекснадр Петрович");
        teacher.evaluate(student);
    }
}
