// СДЕЛАНО c помощь 
/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 6 строк.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */

public class Task_2_1_ {
        public static void main(String[] args) {
            String[] vords = {"Мама", "Мыла", "Раму"};

            for (int i = 0; i < vords.length; i++) {
                for (int j = 0; j < vords.length; j++) {
                    for (int k = 0; k < vords.length; k++) {
                        if (i != j && i != k && j != k) {
                            System.out.println(vords[i] + vords[j] + vords[k]);
                        }
                    }
                }
            }


        }


}


            /*
            String word1 = ("Мама");
            String word2 = ("Мыла");
            String word3 = ("Раму");
           System.out.println(word1+word2+word3);
            System.out.println(word3+word2+word1);
            System.out.println(word1+word3+word2);
            System.out.println(word3+word1+word2);
            System.out.println(word2+word3+word1);
            System.out.println(word2+word1+word3);*/



