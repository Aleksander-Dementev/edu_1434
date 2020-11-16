// СДЕЛАНО!!!
/*
Задание: Запросить у пользователя ввод числа и сохранить это число в переменную a.Если переменная a равна 10, то выведите 'Верно', иначе выведите 'Неверно'.
*/


import java.util.Scanner;
public class Task_2_5 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String inputnumber = "Введите число от 0 до 10: ";
            System.out.print(inputnumber);
            int a = scan.nextInt(); // сумма

            if (a==10){
                System.out.println("Верно");
            }else{
                System.out.println("Неверно");

            }

        }
}
