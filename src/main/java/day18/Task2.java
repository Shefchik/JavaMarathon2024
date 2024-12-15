package day18;

public class Task2 {
    public static void main(String[] args){
        System.out.println("Количество цифр 7 в числе равно = " + count7(717771237));
    }
    public static int count7(int number){
        return countDigits(number, "7", 0);
    }
    public static int countDigits(int number, String digit, int counter){
        if(counter < String.valueOf(number).length()) {
            int digitMark = 0;
            if (digit.equals(String.valueOf(String.valueOf(number).charAt(counter)))) {
                digitMark = 1;
            }
            return countDigits(number, "7", counter + 1) + digitMark;
        }
        return 0;
    }
}
