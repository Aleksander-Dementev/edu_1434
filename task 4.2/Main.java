
/*
+Создать class Dog. У собаки должна быть кличка
+String name и возраст int age.
+Создайте геттеры и сеттеры для всех переменных класса Dog.
Требования:
•	Программа не должна считывать данные с клавиатуры.
•	+У класса Dog должна быть переменная name с типом String.
•	+У класса Dog должна быть переменная age с типом int.
•	У класса должен быть сеттер для переменной name.
•	У класса должен быть геттер для переменной name.
•	У класса должен быть сеттер для переменной age.
•	У класса должен быть геттер для переменной age.
*/


public class Task_4_2_ {
       public static void main(String[] args) {
        Dog dog = new Dog("Шарик",6);//вызваем метод Cat
            dog.setName("Шарик");

                    }
                    }
class Dog {
    private String name;
    String setName;
    int age;
    Dog(String name, int age){ //внутри класса создаем класс и записываем туда переменные
        this.name = name;//присваеваем переменным "name" свойства. this любой персонаж
        this.age = age;//присваеваем переменным "name" свойства. this любой персонаж
        }

    public void setName(String name) {
        System.out.println("Привет, я кот меня зовут "+this.name+" мне "+this.age);


    }
}
