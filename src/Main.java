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
        double startDeposit = 15_000;
        for (int mouth = 1;startDeposit <= 12_000_000 ; mouth++) {
            startDeposit = startDeposit + startDeposit * 0.07;
            System.out.println("Месяц " + mouth + " сумма " + startDeposit);
        }
        // Задача №5
        System.out.println("Задача №5");
        double totalDeposit = 15_000;
        for (int q = 1;totalDeposit <= 12_000_000 ; q++) {
            totalDeposit = totalDeposit + totalDeposit * 0.07;
            if (q % 6 == 0) {
                System.out.println("Месяц " + q + " сумма " + totalDeposit);
            }
        }
        //Задача №6
        System.out.println("Задача №6");
        double startSum = 15_000;
        for (int report = 1; report < (9 * 12) ; report++) {
            startSum = startSum + startSum * 0.07;
            if ( report % 6 == 0){
                System.out.println("По истечению " + report + " месяцев, сумма накоплений будет состовлять " + startSum);
            }
        }
        // Задача №7
        System.out.println("Задача №7");
        int fryday = 7;
        System.out.println("Сегодня пятница, " + fryday + " -е число. Необходимо подготовить отчет.");
        for ( int day = 0; day < 31; day = fryday + 7 ){
            fryday = fryday + 7;
            if (fryday < 31)
                System.out.println("Сегодня пятница, " + fryday + " -е число. Необходимо подготовить отчет.");
            }
        //Задача №8
        System.out.println("Задача №8");

    }
}