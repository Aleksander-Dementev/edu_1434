/*
Задание: Даны переменные a и b. Проверьте, что a делится без остатка на b. Если это так - выведите 'Делится' и результат деления, иначе выведите 'Делится с остатком' и остаток от деления.
*/

public class Task_2.6 {
    public static void main(String[] args) {
        int a = 7;
        int b = 10;
        if (a % b == 0) {
            System.out.println("Делится и равно: " + a / b);
        } else {
            System.out.println("Делится с остатком, который равен: " + a % b);
        }

    }
}
