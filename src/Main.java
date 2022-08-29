public class Main {
    public static void main(String[] args) {
        /*
        ## 1 задача
Объявите три массива:
1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
    - Подсказка
        ```java
        //объявление массива из 12-ти элементов, заполненного нулями
        int [] weight = new int [12];
        ```
2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
    - Подсказка
        ```java
        //объявление целочисленного массива, заполненного 12 элементами
        int [] weight = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
       ```
3. Произвольный массив – тип и количество данных определите сами.
Самостоятельно выберите способ создания массива:
с помощью ключевого слова или сразу заполненный элементами.
         */
        System.out.println("1 задача ");
//1
        int[] massiv123 = new int[]{1, 2, 3};
//2
        float[] massivDrobn = {1.57f, 7.654f, 9.986f};
//3
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};

        /*
        ## 2 задача
Пройдите по каждому из трех массивов и распечатайте все элементы
всех трех массивов, начиная с первого элемента, через запятую.
Запятая между последним элементом одного массива и первым элементом следующего не нужна.
         */
        System.out.println("2 задача ");
        for (int i=0; i<massiv123.length; i++){
            System.out.print(massiv123[i]);
            if (i<massiv123.length-1) System.out.print(", ");
        }
        System.out.println("");
        for (int y=0; y<massivDrobn.length; y++){
            System.out.print(massivDrobn[y]);
            if (y<massivDrobn.length-1) System.out.print(", ");
        }
        System.out.println("");
        for (int t=0; t<seasons.length; t++){
            System.out.print(seasons[t]);
            if (t<seasons.length-1) System.out.print(", ");
        }
        System.out.println(" ");
/*
## 3 задача
Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке, а элементы другого массива – на другой.
Запятая между последним элементом одного массива и первым элементом следующего не нужна.
 */
        System.out.println("3 задача ");
        for (int i=massiv123.length-1; i>=0; i--){
            System.out.print(massiv123[i]);
            if (i>0) System.out.print(", ");
        }
        System.out.println("");
        for (int y=massivDrobn.length-1; y>=0; y--){
            System.out.print(massivDrobn[y]);
            if (y>0) System.out.print(", ");
        }
        System.out.println("");
        for (int t=seasons.length-1; t>=0; t--){
            System.out.print(seasons[t]);
            if (t>0) System.out.print(", ");
        }
        System.out.println(" ");
/*
### 4 задача
Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
Распечатайте результат преобразования в консоль.
 */
        System.out.println("4 задача ");
        for (int i=0; i<massiv123.length; i++){
            if (massiv123[i]%2!=0) {massiv123[i]=massiv123[i]+1;}

            System.out.print(massiv123[i]);
            if (i<massiv123.length-1) System.out.print(", ");
        }






    }
}