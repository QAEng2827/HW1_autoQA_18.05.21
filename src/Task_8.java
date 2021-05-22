public class Task_8 {
    /*
    Времена года
Напишите метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.

Пример для номера месяца 2:
зима

Пример для номера месяца 5:
весна
Примечание: реализовать 2 способами используя операторы if, switch
public class Main {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        //if

        //switch

    }
}
     */

    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(5);
        checkSeason(7);
        checkSeason(77);
        checkSeason(10);
        checkSeason(-10);
        checkSeason(0);
        checkSeason(11);
        checkSeason(9);

    }

    public static void checkSeason(int month) {

        String method1 = "Метод проверки if - ";
        //if
        if (month == 1 || month == 2 || month ==  12){
            System.out.println(method1 + "зима");
        }else if (month == 3 || month == 4 || month ==  5){
            System.out.println(method1 + "весна");
        }else if (month == 6 || month == 7 || month == 8){
            System.out.println(method1 + "лето");
        }else if (month == 10 || month == 9 || month == 11) {
            System.out.println(method1 + "осень");
        }else {
            System.out.println(method1 + "месяца с таким номером в григорианском календаре нет");
        }
 String method2 = "Метод проверки swich - ";
        //switch
        switch (month){

            case 1: case 2: case 12:
                System.out.println(method2 +"зима");
                break;

            case 3: case 4: case 5:
                System.out.println(method2 + "весна");
                break;

            case 6: case 7: case 8:
                System.out.println(method2 + "лето");
                break;

            case 9: case 10: case 11:
                System.out.println(method2 +"осень");
                break;

                       default:
                System.out.println(method2 + "месяца с таким номером в григорианском календаре нет");
                break;
        }

    }
}
