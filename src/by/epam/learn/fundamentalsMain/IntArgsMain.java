package by.epam.learn.fundamentalsMain;

public class IntArgsMain {
         public static void main(String[] args) {
            int[]arg = {21,22,23,24,25};
            int sum =0;
            int mult =1;
            for (int i = 0; i < arg.length; i++){
                sum += arg[i];
                mult*= arg[i];
            }
            System.out.println("Multiplication of arguments:" + " = " + mult);
            System.out.println("Sum of arguments:" + " = " + sum);
        }
    }
