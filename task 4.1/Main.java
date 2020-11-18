/*
Помогите коту обрести имя с помощью метода setName.
Требования:
+•	Класс Cat должен содержать только одну переменную name.
+•	Переменная name должна иметь модификатор доступа private и тип
String.
+•	Метод setName класса Cat должен устанавливать значение переменной
private String name равным переданному параметру String name.
*/

public class Task_4_1_ {
public static void main(String[] args) {
            Cat cat = new Cat("Жужик");//вызваем метод Cat
            cat.setName("Жужик");
        }
    }
    class Cat {
        private String name = "безымянный кот";
        String setName;
        Cat(String name){ //внутри класса создаем класс и записываем туда переменные
           this.name = name;//присваеваем переменным "name" свойства. this любой персонаж
        }

        public void setName(String name) {
            System.out.println("Привет, я кот меня зовут "+this.name);


        }
    }


