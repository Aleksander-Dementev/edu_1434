import java.util.Scanner;
// СДАЛАНО!!!
/*
Задание: Пользователь вводит сумму вклада и процент,
 который будет начисляться ежегодно. Отобразить размер вклада
  поочередно на ближайшие 5 лет.
*/
public class Task_2_4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String inputdeposit = "Введите сумму вклада, руб.:";
            System.out.print(inputdeposit);
            int nomberdeposit = scan.nextInt(); // сумма

            String inputpercent = "Введите процент, %:";
            System.out.print(inputpercent);
            int percent = scan.nextInt(); // процент

            for (int i = 0; i < 5; i++) {
                nomberdeposit=((nomberdeposit*percent/100)+nomberdeposit);
                System.out.println(nomberdeposit);
            }




            /*String inputdeposit = "Введите сумму вклада, руб.:";
            System.out.print(inputdeposit);
            int nomberdeposit = scan.nextInt();

            String inputpercent = "Введите процент, %:";
            System.out.print(inputpercent);
            int percent = scan.nextInt();

            int cum1 = ((nomberdeposit*percent/100)+nomberdeposit);
            System.out.println("Итого за 1 год: "+cum1);

            int cum2 = ((cum1*percent/100)+cum1);
            System.out.println("Итого за 2 год: "+cum2);

            int cum3 = ((cum2*percent/100)+cum2);
            System.out.println("Итого за 3 год: "+cum3);

            int cum4 = ((cum3*percent/100)+cum3);
            System.out.println("Итого за 4 год: "+cum4);

            int cum5 = ((cum4*percent/100)+cum4);
            System.out.println("Итого за 5 год: "+cum5);*/
        }
    }
