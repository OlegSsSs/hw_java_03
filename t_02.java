import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 2 Пусть дан произвольный список целых чисел, удалить из него четные числа

public class t_02 {
    public static void main(String[] args) {
        List <Integer> number=new ArrayList <Integer>();

        number.add(11);
        number.add(45);
        number.add(12);
        number.add(32);
        number.add(2);
        number.add(3);
        number.add(44);


     
        System.out.println("Список чисел: "+ number);
     
        for (int i = 0; i < number.size(); i++){      
            int even = number.get(i)%2;       
             if (even==0) {
                 System.out.println("Четное число: "+ number.get(i));
                 number.remove(i);
                 i--;
            }    
        }
     
         Collections.sort(number);
         System.out.println("Список без четных чисел: "+ number);
        
    
    }
}