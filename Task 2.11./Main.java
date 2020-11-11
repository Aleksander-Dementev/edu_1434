//СДЕЛАНО не понял как вывести количесто элементов одним числом
public class Task_2_11 {
/*
Задание: Дан массив с числами. Узнайте сколько элементов
с начала массива  надо сложить,
 чтобы в сумме получилось больше 10-ти.
*/
         public static void main(String[] args) {
             int[] naums = {2, 3, 1, 4, 1, 1};
             int sum = 0;
             for (int i = 0; i <naums.length; i++) {
                 if (sum <= 10) sum += naums[i];
                 {
                     System.out.println(sum <= 10);

                 }



                 }
             }
         }

