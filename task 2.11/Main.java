//СДЕЛАНО 
public class Task_2_11 {
/*
Задание: Дан массив с числами. Узнайте сколько элементов
с начала массива  надо сложить,
 чтобы в сумме получилось больше 10-ти.
*/
        public static void main(String[] args) {
        int[] naums = {2, 3, 1, 4, 1, 1};
        int sum = 0;
        int i = 0;
        while (sum <= 10) {
            sum += naums[i];
            i++;
            if (i == naums.length && sum <= 10) {
                System.out.println("Сумма всех числе массива меньше 10");
                break;
            }
        }
            if (sum > 10) {
                System.out.println(i);
        }
    }
}
