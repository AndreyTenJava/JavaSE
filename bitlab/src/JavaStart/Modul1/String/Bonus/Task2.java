package JavaStart.Modul1.String.Bonus;

//Сделайте некое подобие калькулятора который принимает два числа и оператор(+, -, *, /)
// между ними в виде текста. Выведите на экран результат операции.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] symbols = str.split("[0-9]+");
        String[] operands = str.split("[+-/*]");
        int result = Integer.parseInt(operands[0]);
        for (int i = 1; i < operands.length; i++) {
            if (symbols[i].equals("+")) {
                result += Integer.parseInt(operands[i]);
            } else if (symbols[i].equals("-")) {
                result -= Integer.parseInt(operands[i]);
            }else if (symbols[i].equals("/")) {
                result /= Integer.parseInt(operands[i]);
            }else if (symbols[i].equals("*")) {
                result *= Integer.parseInt(operands[i]);
            }
        }
        System.out.println(result);
    }
}
