package Interface.Users;

public class Main {
    public static void main(String[] args) {
        Users u1 = new Users("John", "Black");
        Users u2 = new Users("Nick", "Dow");
        Users u3 = new Users("Jacky","Chan");
        Users u4 = new Users("Arnold","Smoke");
        Users u5 = new Users("Sandra", "Bullock");
        Users u6 = new Users("Nicole","Smith");
        Users u7 = new Users("Anna", "Haris");
        Users u8 = new Users("Mickael", "Flash");
        Users u9 = new Users("Monica","Beluchi");
        Users u10 = new Users("Vensant", "Cassele");
        Users[] users = {u1, u2, u3, u4, u5, u6, u7, u8, u9, u10};

        UserBeanImp userBeanImp = new UserBeanImp(users);
        userBeanImp.getAllUsers();
        userBeanImp.getUsersByName("John");
        userBeanImp.getUsersBySurname("Smith");
    }
}
