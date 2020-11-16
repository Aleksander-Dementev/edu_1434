//решено c помощию не знал что возможна запись length-1
public class Task_2_9 {
/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5.
 Если есть - выведите 'да', а если нет - выведите 'нет'.
*/
        public static void main(String[] args) {
            int massivs[] = {15, 5, 12, 43, 5};
            int a = 5;
                        for (int i = 0; i < massivs.length; i++) {
                        if ((massivs[i] == a)) {
                                System.out.println("да");
                                break;
                            }else
                            if (i == massivs.length-1) {
                                System.out.println("нет");
                            }
}}}



