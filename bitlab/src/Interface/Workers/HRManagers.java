package Interface.Workers;

public class HRManagers implements Workers{
    int id;
    String fullName;
    int salary;

    public HRManagers(){}

    public HRManagers(int id, String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return id + " " + fullName;
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
