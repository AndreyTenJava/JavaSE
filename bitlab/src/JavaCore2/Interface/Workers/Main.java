package JavaCore2.Interface.Workers;

public class Main {
    public static void main(String[] args) {
        Staff s1 = new Staff(1, "name1", "surname1", 100);
        Staff s2 = new Staff(2, "name2", "surname2", 500);
        Staff s3 = new Staff(3, "name3", "surname3", 400);
        Staff s4 = new Staff(4, "name4", "surname4", 200);
        Staff s5 = new Staff(5, "name5", "surname5", 300);

        HRManagers h1 = new HRManagers(1, "fullName1", 150);
        HRManagers h2 = new HRManagers(2, "fullName2", 450);
        HRManagers h3 = new HRManagers(3, "fullName3", 550);
        HRManagers h4 = new HRManagers(4, "fullName4", 650);
        HRManagers h5 = new HRManagers(5, "fullName5", 750);

        Programmers p1 = new Programmers(1, "nickName1", 230, 230, 0.2);
        Programmers p2 = new Programmers(2, "nickName2", 370, 330, 0.1);
        Programmers p3 = new Programmers(3, "nickName3", 530, 130, 0.5);
        Programmers p4 = new Programmers(4, "nickName4", 730, 210, 0.7);
        Programmers p5 = new Programmers(5, "nickName5", 810, 280, 1.0);

        Workers[] workers = {s1, s2, s3, s4, s5, h1, h2, h3, h4, h5, p1, p2, p3, p4, p5};

        bubbleSort(workers);

        int maxSalary = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < workers.length; i++){
            System.out.println(workers[i].getWorkerData());

            if (workers[i].getSalary() > maxSalary){
                maxSalary = workers[i].getSalary();
                index = i;
            }
        }

        System.out.println("=== Max Salary Workers ===");
        System.out.println(workers[index].getWorkerData());
    }

    public static void bubbleSort (Workers[] employees){
        for (int i = 0; i < employees.length; i++){
            for (int j = 0; j < employees.length; j++){
                if (employees[i].getSalary() < employees[j].getSalary() && i != j) {
                    Workers temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
    }
}
