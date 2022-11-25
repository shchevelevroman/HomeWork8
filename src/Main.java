import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1");
        int salary = 15_000;
        double total = 0;
        int i = 0;
        for ( ; total < 2_459_000; i ++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        //Задача №2
        System.out.println("Задача №2");
        int z = 0;
        while (z < 10){
            z++;
            System.out.print(z + " ");
        }
        System.out.println("");
        int x = 11;
        while (x >1){
            x--;
            System.out.print(x + " ");
        }
    }
}