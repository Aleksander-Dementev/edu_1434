/*
+Создать абстрактный класс Animal с характеристиками животного.
+Создать класс Horse который наследуется от Animal, в классе Horse реализовать
+метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
+Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать
+ метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
+Создать объект лошади и вызвать метод run();
+Создать объект пегаса и вызвать метод fly();
*/

public class Task_4_5_ {
    public static void main(String[] args) {
        Horse horseGogo = new Horse("Лошарик", 4);
        horseGogo.run();
        Pegasus horseGoFly = new Pegasus("ПегасиК", 4);
        horseGoFly.fly();
    }
}
class Animal {
    String nickname;
    int age;
    public Animal(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }
    // возраст не передаем
}
class Horse extends Animal {
    public Horse(String nickname, int age) {
        super(nickname, age);
    }
    public void run() {
        System.out.println("Игого, я поскакала");
    }
}
    class Pegasus extends Horse {
        public Pegasus(String nickname, int age) {
            super(nickname, age);
        }
        public void fly() {
            System.out.println("Игого, я полетела");
        }

    }

