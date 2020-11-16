//СДЕЛАНО с подсказкой (Length-1/Length-2/ не знал что можно добовлять заначения в Length)
public class Task_2_10_ {
/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа
 подряд. Если есть - выведите 'да', а если нет - выведите 'нет'.
*/
        public static void main(String[] args) {
            int[] naum = {5, 5, 7, 2, 3, 4};
            for (int i = 0; i < naum.length-1; i++) {
                if (naum[i] == naum[i+1]) {
                    System.out.println("да");
                    break;
                }else if (i==naum.length-2){
                    System.out.println("нет");

                }
            }
                       }
            }




