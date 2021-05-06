package by.epam.learn.fundamentalsMain;

import java.io.*;
import static java.lang.System.out;

    public class NumbersMain {
        public static void main(String[] args) throws IOException {
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            String str[] = new String[5];
            int numbInt[] = new int[5];
            try {
                out.println("Enter a number: ");
                for (int i = 0; i < 5; i++) {
                    str[i] = br.readLine();
                    numbInt[i] = Integer.valueOf(str[i]);
                }
                out.print("Integer numbers are: ");
                for (int i = 0; i < 5; i++) {
                    out.println(numbInt[i] + "  ");
                }
                out.println("\n");
                int max = numbInt[0];
                int min = numbInt[1];
                for (int i = 0; i < numbInt.length; i++) {
                    if(max<numbInt[i])
                        max=numbInt[i];
                }
                for (int i = 0; i < numbInt.length; i++) {
                    if(min>numbInt[i])
                        min=numbInt[i];
                }
                out.println("The shortest number is:" + min + "   It's length is:  " + Integer.toString(min).length());
                out.println("The longest number is:" + max  + "   It's length is:  " + Integer.toString(max).length());
            }
            catch(IOException e)
            {
                e.printStackTrace();
                out.println("Input error " + e);
                out.println("Please, try again:");
                main(new String[0]);
            }
            catch(NumberFormatException e)
            {
                out.println("Incorrect number format." + e);
                out.println("Please, try again:");
                main(new String[0]);
            }
        }
    }