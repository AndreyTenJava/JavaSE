package ArrayList.BankApplication;

import java.util.ArrayList;

public class BankApplication {
    private String name;
    private ArrayList <Account> accounts = new ArrayList<>();

    public BankApplication() {

    }

    public BankApplication(String name) {
        this.name = name;
    }

    public void addAccount(Account a) { // Добавляет новый объект Account
       accounts.add(a);
    }
    public void removeAccount(int i) { // Удаляет объект со списка под индексом i
        accounts.remove(i);
    }
    public Account getMaxAccount() { // Возвращает объект Account у кого самый высокий баланс
        double maxAccount = Double.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < accounts.size(); i++){
            if(accounts.get(i).getBalance() > maxAccount) {
                maxAccount = accounts.get(i).getBalance();
            index = i;
            }
        }return accounts.get(index);

    }
    public double getAverageBalance() {  // Возвращает среднее значение баланса пользователей
         double total = 0;
         int count = 0;
         double average = 0;
        for(int i = 0; i < accounts.size(); i++) {
            total += accounts.get(i).getBalance();
            count++;
        } average = total/count;
        return average;
    }

    public double getTotalBalance() { // Возвращает сумму баланса пользователей
        double total = 0;
        for(int i = 0; i < accounts.size(); i++) {
            total += accounts.get(i).getBalance();
        }
        return total;
    }

    public int totalAccounts() { // Возвращает количество пользователей

        return accounts.size();
    }

    public String getBankData() { // Возвращает имя банка, количество счетов, сумму баланса и среднее значение баланса
        return "Name: " + name + ", Total Accounts: " + totalAccounts() + ", Total Balance: " + getTotalBalance() + ", Average Balance: " + getAverageBalance();
    }

}
