public class Task_5 {
    /*
    Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 4 ...
2 4 6 8 ...
3 6 9 12 ...
4 8 12 16 ...
...

public class Main {
    public static void main(String[] args) {
        System.out.println(multiplicationTable(1));
        System.out.println(multiplicationTable(2));
        System.out.println(multiplicationTable(3));
        System.out.println(multiplicationTable(4));
        System.out.println(multiplicationTable(5));
        System.out.println(multiplicationTable(6));
        System.out.println(multiplicationTable(7));
        System.out.println(multiplicationTable(8));
        System.out.println(multiplicationTable(9));
        System.out.println(multiplicationTable(10));


    }
    public static String multiplicationTable (int number){
        //напишите тут ваш код
    }
} */


    public static String multiplicationTable (int number){

        String result = "";

        for (int i = 1; i <= 10; i++){
            Integer num = number * i;
            result = result + " " + num;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiplicationTable(1));
        System.out.println(multiplicationTable(2));
        System.out.println(multiplicationTable(3));
        System.out.println(multiplicationTable(4));
        System.out.println(multiplicationTable(5));
        System.out.println(multiplicationTable(6));
        System.out.println(multiplicationTable(7));
        System.out.println(multiplicationTable(8));
        System.out.println(multiplicationTable(9));
        System.out.println(multiplicationTable(10));

    }
}
