public class Task_7 {
    /*
    Реализуте метод setName.
public class Human {
    private String name = "человек";

    public void setName(String name) {
        //напишите тут ваш код

    }

    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Макс");
        System.out.println(human.name);
    }
}

     */

    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Макс");
        System.out.println(human.name);
    }

    public static class Human {
        private String name = "человек";

        public void setName(String name) {
            this.name = name;
        }


    }
}
