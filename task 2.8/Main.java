//РЕШЕНО
public class Task_2_8 {
/*
Задание: Дан массив с элементами [2, 3, 4, 5].
С помощью цикла for найдите произведение элементов этого массива.
*/
        public static void main(String[] args) {
          int[] numbers = {2, 3, 4, 5, 1};
        int sum = 0;
        int i = 0;
        while (sum <= 10) {
            sum += numbers[i];
            i++;
            if (i == numbers.length && sum <= 10) {
                System.out.println("Сумма всех числе массива меньше 10");
                break;
            }


        }
        if (sum > 10) {
            System.out.println(i);
        }
    }
}
