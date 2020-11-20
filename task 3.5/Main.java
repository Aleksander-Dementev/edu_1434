/* Решено (помощью на видео трансляции)
Задание: Дан массив с числами. Выведите последовательно его элементы
используя рекурсию и не используя цикл.
*/
public class Task_3_5_ {
    public static void main(String[] args) {
        int num[] = {4, 2, 6, 2, 65};
        /*int index = 0;*/
        showItems(num,0);
    }
        public static void showItems(int nams[],int index){
            if (index <nams.length) {
                System.out.println(nams[index]);
                index++;
                showItems(nams, index);


            }
        }
    }
