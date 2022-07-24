package ArrayList.BankApplication;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BankApplication bal1 = new BankApplication("Halyk Bank");
        BankApplication bal2 = new BankApplication("Jusan Bank");
        BankApplication bal3 = new BankApplication("Kapi Bank");

        bal1.addAccount(new Account(1, "name1", "surname1", 11000));
        bal1.addAccount(new Account(2, "name2", "surname2", 2000));
        bal1.addAccount(new Account(3, "name3", "surname3", 3000));
        bal1.addAccount(new Account(4, "name4", "surname4", 24000));
        bal1.addAccount(new Account(5, "name5", "surname5", 15000));
        bal1.addAccount(new Account(6, "name6", "surname6", 6000));
        bal1.addAccount(new Account(7, "name7", "surname7", 27000));
        bal1.addAccount(new Account(8, "name8", "surname8", 18000));
        bal1.addAccount(new Account(9, "name9", "surname9", 29000));
        bal1.addAccount(new Account(10, "name10", "surname10", 10000));

        bal2.addAccount(new Account(11, "name11", "surname11", 21000));
        bal2.addAccount(new Account(12, "name12", "surname12", 22000));
        bal2.addAccount(new Account(13, "name13", "surname13", 13000));
        bal2.addAccount(new Account(14, "name14", "surname14", 14000));
        bal2.addAccount(new Account(15, "name15", "surname15", 5000));
        bal2.addAccount(new Account(16, "name16", "surname16", 16000));
        bal2.addAccount(new Account(17, "name17", "surname17", 7000));
        bal2.addAccount(new Account(18, "name18", "surname18", 28000));
        bal2.addAccount(new Account(19, "name19", "surname19", 9000));
        bal2.addAccount(new Account(20, "name20", "surname20", 30000));

        bal3.addAccount(new Account(21, "name21", "surname21", 1000));
        bal3.addAccount(new Account(22, "name22", "surname22", 12000));
        bal3.addAccount(new Account(23, "name23", "surname23", 23000));
        bal3.addAccount(new Account(24, "name24", "surname24", 4000));
        bal3.addAccount(new Account(25, "name25", "surname25", 25000));
        bal3.addAccount(new Account(26, "name26", "surname26", 26000));
        bal3.addAccount(new Account(27, "name27", "surname27", 17000));
        bal3.addAccount(new Account(28, "name28", "surname28", 8000));
        bal3.addAccount(new Account(29, "name29", "surname29", 19000));
        bal3.addAccount(new Account(30, "name30", "surname30", 20000));

        ArrayList<BankApplication> allBanks = new ArrayList<>();
        allBanks.add(bal1);
        allBanks.add(bal2);
        allBanks.add(bal3);

        BubbleSort(allBanks);

    }

    public static void BubbleSort(ArrayList<BankApplication> banks) {
        BankApplication temp;
        for (int i = 0; i < banks.size(); i ++){
            for (int j = 0; j < banks.size(); j++){
                if (banks.get(i).getAverageBalance() > banks.get(j).getAverageBalance() && i!=j) {
                    temp = banks.get(j);
                    banks.set(j, banks.get(i));
                    banks.set(i, temp);
                }
            }
        }
        for (int i = 0; i < banks.size(); i++) {
            System.out.println(banks.get(i).getBankData());
        }
    }
}
