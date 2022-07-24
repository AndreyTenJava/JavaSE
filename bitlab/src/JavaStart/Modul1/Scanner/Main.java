package JavaStart.Modul1.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Это сумма денег за товар
        int money = 2000000;
        // Здесь мы считаем сколько товара было продано
        int countOfGoods = money / 5000;
        // Здесь мы считаем сколько денег составляет 5% от одного товара
        double persentageFromGoods = 5000 * 0.05;
        // Тут мы выявляем сумму денег которые получит Арман за продажу товара без 20%
        double result = countOfGoods * persentageFromGoods;
        // Здесь мы считаем 20% от общей суммы, для Армана
        double plusSailedPersentage = money * 0.2;
        // В конце мы просто находим общую сумму
        result = result + plusSailedPersentage;
        System.out.println(result);
    }

}