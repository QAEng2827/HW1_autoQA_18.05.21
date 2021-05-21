public class Task_6 {
    /*Подсчитать суммарную стоимость яблок.
За суммарную стоимость яблок отвечает переменная public static int applesPrice.
public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("Стоимость яблок " + Apple.applesPrice);
    }

    public static class Apple {
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice) {
            //напишите тут ваш код

        }
    }
}
 public static void main(String[] args) {
        Apple apple1 = new Apple();
        apple1.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("Стоимость яблок " + Apple.applesPrice);
    }

    public static class Apple {
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice) {
            //напишите тут ваш код
            Apple.applesPrice = Apple.applesPrice + applesPrice;

        }
    }

     */

    public static class Apple {
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice) {
            Apple.applesPrice = Apple.applesPrice + applesPrice;


        }
        public static void main(String[] args) {
            Apple apple = new Apple();
            apple.addPrice(50);
            Apple apple2 = new Apple();
            apple2.addPrice(100);
            System.out.println("Стоимость яблок " + Apple.applesPrice);
        }


        }
    }

