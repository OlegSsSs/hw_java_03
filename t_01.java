// 1 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class t_01 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(0, 20));
        }
        for (int i : list) {
            System.out.print(i + " ");
        }

        System.out.println();
        Collections.sort(list);

        for (int i : list) {
            System.out.print(i + " ");
        }

        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        // System.out.println(list);
        System.out.print("\nСреднее арифмитическое: " + sum/list.size());
        System.out.print("\nМаксимальное число: " + Collections.max(list));
        System.out.print("\nМинимальное число: " + Collections.min(list));
    }
}