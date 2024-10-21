package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student){
        Random rnd  = new Random();
        int minNumber = 2;
        int maxNumber = 5;
        int evaluationMark;
        evaluationMark = rnd.nextInt(maxNumber - minNumber + 1) + minNumber;
        System.out.println("Преподаватель " + getName()
                                + " оценил студента с именем " + student.getName()
                                    + " по предмету " +  getSubject() + " на оценку " + getEvaluationMarkToString(evaluationMark));
    }
    private String getEvaluationMarkToString(int evaluationMark){
        switch (evaluationMark) {
            case 2:
                return "неудовлетворительно";
            case 3:
                return "удовлетворительно";
            case 4:
                return "хорошо";
            case 5:
                return "отлично";
            default:
                return "нет отметки";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }
}
