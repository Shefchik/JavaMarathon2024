package day18;

public class Task1 {
    public static void main(String[] args){
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        recursionSumUp(numbers, 0, 0);
    }

    public static void  recursionSumUp(int[] numbers, int counter, int resultSum){

        if(counter < numbers.length){
            int rSum = numbers[counter] + resultSum;
            recursionSumUp(numbers, counter + 1, rSum);
        }else{
            System.out.println("сумма чисел массива равна = " + resultSum);
        }
    }
}
