import java.util.Scanner;
public class Task_1_6 {
/*
Пользователь вводит число, необходимо увеличить это число на 15%
и вывести результат на экран
*/
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String head1 = "Увеличение числа на 15%";
            String head2 = "Введите число:";
            String end1 = "Итого:";
            System.out.println(head1);
            System.out.println(head2);
            int TC = scan.nextInt();
            System.out.println(end1);
            System.out.println(TC*1.15);
        }
}
