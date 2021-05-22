import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_11 {
    /*
    Задача: Программа вводит два числа с клавиатуры и выводит их максимум в виде "The max is 25".
public class Main {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        ////напишите тут ваш код

        System.out.println(text + max);
    }
}
     */

        public static int max = 100;

        private static String maxNumber(int a, int b) {
          int res = 0;

          if (a > b){
            res = a;
          } else if (b > a ) {
            res = b;
          }

          return Integer.toString(res);
        }

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            String text = "The max is ";

            System.out.println(text + maxNumber(a,b));
        }


    }

