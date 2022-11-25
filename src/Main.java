import java.sql.SQLOutput;
import java.util.concurrent.LinkedTransferQueue;

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
        for (int x = 10; x >= 1; x--){
            System.out.print(x + " ");
        }
        System.out.println(" ");
        //Задача №3
        System.out.println("Задача №3");
        int population = 12_000_000;
        int growsMan = (population / 1_000) * 17;
        int declineMan = (population / 1_000) * 6;
        for (int q = 1; q <= 10; q++) {
            population = population + growsMan - declineMan;
            System.out.println("Год " + q + ", численность населения составляет " + population);
        }
        // Задача №4
        System.out.println("Задача №4");

    }
}