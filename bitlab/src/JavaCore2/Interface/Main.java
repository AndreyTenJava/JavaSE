package JavaCore2.Interface;

public class Main {
    public static void main(String[] args) {
        Users u1 = new Users("John", "Dow");
        Users u2 = new Users("Jain", "Smith");
        Users u3 = new Users("Jacky", "Chan");
        Users u4 = new Users("Will", "Smith");
        Users u5 = new Users("Victorya", "Beckham");
        Users u6 = new Users("Aibek", "Zhanibekov");
        Users u7 = new Users("Sergey", "Sergeev");
        Users u8 = new Users("John", "Kim");
        Users u9 = new Users("Derick", "Smith");
        Users u10 = new Users("John", "Black");

        Users [] users = {u1, u2, u3, u4, u5, u6, u7, u8, u9, u10};
        UserBeanImp userBeanImp = new UserBeanImp(users);
        userBeanImp.getAllUsers();
        System.out.println("___ Get By Name John ___");
        userBeanImp.getUsersByName("John");
        System.out.println("___ Bet By Surname 'Smith' ___");
        userBeanImp.getUsersBySurname("Smith");
    }
}
