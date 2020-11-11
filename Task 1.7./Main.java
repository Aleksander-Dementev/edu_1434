/* Задача наполнить корабельный бассейн. Нужно посчитать, сколько литров воды нужно для заполнения бассейна до бортов.
Известно, что бассейн имеет линейные размеры a × b × c, заданные в метрах.
Эти размеры передаются запрашиваются у пользователя. Прграмма должена вывести на экран количество литров воды,
которое нужно для наполнения бассейна.
Пример:
Пользователь даёт числа 25, 5, 2.
Пример вывода:
250000 */


import java.util.Scanner;
public class Task_1_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String head1 = "Расчет количичества литров";
        String head2 = "Введите параметры бассейна, метрах:";
        String body1 = "Ширина, м.:";
        String body2 = "Длина, м.:";
        String body3 = "Высота, м.:";
        String end1 = "Итого в бассейне литров:";
        System.out.println(head1);
        System.out.println(head2);
        System.out.println(body1);
        int a = scan.nextInt();
        System.out.println(body2);
        int b = scan.nextInt();
        System.out.println(body3);
        int c = scan.nextInt();
        System.out.println(end1);
        System.out.println(a*b*c*1000);

    }
}
