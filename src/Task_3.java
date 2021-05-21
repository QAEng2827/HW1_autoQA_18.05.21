public class Task_3 {
   /* Написать функцию, которая возвращает минимум из двух чисел.
            Подсказка:
    Нужно написать тело существующей функции min.
    public class Solution {
        public static int min(int a, int b) {
            //напишите тут ваш код

        }

        public static void main(String[] args) {
            System.out.println(min(12, 33));
            System.out.println(min(-20, 0));
            System.out.println(min(-10, -20));
        }
    } */

    public static int min(int a, int b) {
        int res;
        if (a < b){
            res = a;
        } else if (a > b){
            res = b;
        } else {
            res = a;
            System.out.print("Числа a и b равны " );
        }return res;

    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-30, -30));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));

    }
}
