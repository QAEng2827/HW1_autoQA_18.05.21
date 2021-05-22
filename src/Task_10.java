public class Task_10 {
    /*
    Геттеры и сеттеры для класса Dog
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
     */
    public class Dog{
        private String name;
        private int age;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Dog getDog() {
            return dog;
        }

        public void setDog(Dog dog) {
            this.dog = dog;
        }

        Dog dog = new Dog();
    }

}
