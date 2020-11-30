//РЕШЕНО
public class Task_2_8 {
/*
Задание: Дан массив с элементами [2, 3, 4, 5].
С помощью цикла for найдите произведение элементов этого массива.
*/
        public static void main(String[] args) {
            int numbers[] = {2,3,4,5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum *= numbers[i]; // sum = sum * numbers[i];
        }
        System.out.println(sum);

        }    }



