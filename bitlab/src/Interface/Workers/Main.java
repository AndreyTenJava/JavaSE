package Interface.Workers;

public class Main {
    public static void main(String[] args) {
        Staff worker1 = new Staff(1001, "John", "Black", 2000);
        Staff worker2 = new Staff(1002, "Liza", "Smith", 2200);
        Staff worker3 = new Staff(1003, "Steve", "Fox",2400);
        Staff worker4 = new Staff(1004, "Michele","Stone",2600);
        Staff worker5 = new Staff(1005,"Sara","Parker",2700);
        HRManagers worker6 = new HRManagers(1006, "Natasha White",2300);
        HRManagers worker7 = new HRManagers(1007,"Kira Night",2400);
        HRManagers worker8 = new HRManagers(1008,"Anna Haris", 2500);
        HRManagers worker9 = new HRManagers(1009,"Dina Dow",2600);
        HRManagers worker10 = new HRManagers(1010,"Nicole Flash",2800);
        Programmers worker11 = new Programmers(1011,"Max",2500,700,0.3);
        Programmers worker12 = new Programmers(1012,"Sabyrhan",2700, 300,0.5);
        Programmers worker13 = new Programmers(1013,"Sonic",2600,500,0.7);
        Programmers worker14 = new Programmers(1014,"Fox",2900,400,0.8);
        Programmers worker15 = new Programmers(1015,"Leon",3000,600,0.9);

        Workers[] workers = {worker1, worker2, worker3, worker4, worker5, worker6, worker7, worker8, worker9, worker10, worker11, worker12, worker13, worker14, worker15};

        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < workers.length; i++){

            if(workers[i].getSalary() > max) {
                max = workers[i].getSalary();
                index = i;
            }

            }
        System.out.println(workers[index].getWorkerData() + " " + max);

    }
}
