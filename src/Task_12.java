import java.io.IOException;
import java.util.Scanner;

public class Task_12 {
    /*
    Чётные и нечётные цифры
Ввести с клавиатуры положительное число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.

Пример для числа 4445:
Even: 3 Odd: 1

public class Main {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
     */

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {

        System.out.print("Input a number: ");
        Scanner inputNum = new Scanner(System.in);
        int number = inputNum.nextInt();

       String stringNum = Integer.toString(number);
        System.out.println("Number lenth: "+stringNum.length()+" digits");


        int result;
        int i;
        for (i =0; i < stringNum.length(); i++) {
        result = Integer.parseInt(String.valueOf(stringNum.charAt(i)));
        if (result % 2 == 0){
            even++;
        } else {
            odd++;
        }
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }


}
