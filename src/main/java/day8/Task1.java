package day8;

public class Task1 {
    public static void main(String[] args){
        final int UPPER_LIMIT = 20000;
        StringBuilder sb = new StringBuilder("0");
        long startTime;
        long endTime;
        startTime= System.currentTimeMillis();
        for(int counter = 1; counter <= UPPER_LIMIT; counter++){
            sb.append(" " + counter);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения конкатенации через StringBuilder: " + (endTime - startTime));


        startTime= System.currentTimeMillis();
        String str = "0";
        for(int counter = 1; counter <= UPPER_LIMIT; counter++){
            str+= " " + counter;
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения конкатенации через '+' : " + (endTime - startTime));

        System.out.println("sb = " + sb.toString());
        System.out.println("str = " + str.toString());
    }
}
