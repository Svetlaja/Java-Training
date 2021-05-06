package by.epam.learn.fundamentals;

import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.System.*;

public class MainTask_Month{
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(in);
            out.print("Enter number of the Month: ");
            int number = input.nextInt();
            switch (number)
            {
                case 1:out.println(" - This is January"); break;
                case 2:out.println(" - This is February");break;
                case 3:out.println(" - This is March"); break;
                case 4:out.println(" - This is April"); break;
                case 5:out.println(" - This is May");break;
                case 6: out.println(" - This is June");break;
                case 7:out.println(" - This is July");break;
                case 8:out.println(" - This is August");break;
                case 9:out.println(" - This is September");break;
                case 10:out.println(" - This is October");break;
                case 11:out.println(" - This is November");break;
                case 12:out.println(" - This is December");break;
                default:out.println("The incorrect input.");
                    main(new String[0]);
            }
        }
        catch (InputMismatchException e)
        {
            out.println("The incorrect input.");
            out.println("Please, try again:");
            main(new String[0]);
        }
    }
}