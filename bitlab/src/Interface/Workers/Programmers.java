package Interface.Workers;

public class Programmers implements Workers{
    int id;
    String nickname;
    int salary;
    int bonusSalary;
     double KPIValue;

     public Programmers(){}

    public Programmers(int id, String nickname, int salary, int bonusSalary, double KPIValue) {
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIValue = KPIValue;
    }

    @Override
    public String getWorkerData() {
        return id + " " + nickname + " " + getSalary();
    }

    @Override
    public int getSalary() {
        return (int)(salary + KPIValue*bonusSalary);
    }
}
