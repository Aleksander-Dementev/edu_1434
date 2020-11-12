
//СДеЛАНО с помощью не догодался: eight += 8;
/*
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример вывода на экран:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888
*/
public class Task_2_3_ {
    public static void main(String[] args) {
        String eight = "8";
        for (int i = 0; i < 10; i++) {
            System.out.println(eight);
            eight += 8;

        }

    }
}



     /*   int a = 8;
        for (int i = 1; i < 10; i++) {
            System.out.println(a);
            for (int j = 0; j<8; j++) {
                System.out.print(a);*/


