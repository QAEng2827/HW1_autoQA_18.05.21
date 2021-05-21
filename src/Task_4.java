public class Task_4 {
    /*
    Добавь метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
Вызови его дважды в методе main с любыми параметрами.
Результаты выведи на экран, каждый раз с новой строки.
public class Solution {
    //напишите тут ваш код


    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(2));
    }
}
     */

    public static int convertToSeconds(int hour){
        int convertToSeconds = hour*3600;
        return convertToSeconds;

    }
    public static void main(String[] args) {

        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(2));
    }
}
