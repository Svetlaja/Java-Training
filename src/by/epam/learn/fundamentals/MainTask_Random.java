package by.epam.learn.fundamentals;

public class MainTask_Random {
    public static void main(String[] args) {
        for (int i = 0 ; i <= 11; i++) {
            int x = (int) (Math.random()*11);
            System.out.println("Number №:" + i + " = " + x);
        }
    }
}