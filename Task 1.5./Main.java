import java.util.Scanner;
public class Task_1_5 {
/*
ВНИМАНИЕ! ДЛЯ РЕШЕНИЯ ЗАДАЧИ НЕОБХОДИМО ПРОСМОТРЕТЬ УРОК №4
 https://www.youtube.com/watch?v=WmZ6kVTlWtg&list=PLOep0pi-UBExIxCNegkvCrBuDh0TE7Ihq&index=4
Программа запрашивает у пользователя значение в градусах Цельсия.
Программа должена переводить температуру и выводить на экран
значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны
следующим соотношением:
TF = (9 / 5) * TC + 32
Пример:
на вход подается значение 41.
Пример вывода:
105.8 */

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String head1 = "Перевод из градусов Цельсия в Фарингейт";
            String head2 = "Введите градусов Цельсия:";
            String end1 = "Итого в Фарингейт:";
            System.out.println(head1);
            System.out.println(head2);
            int TC = scan.nextInt(); //Цельсия
            System.out.println(end1);
            System.out.println(1.8*TC+32);
        }
    }
