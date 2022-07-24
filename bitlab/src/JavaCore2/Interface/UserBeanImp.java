package JavaCore2.Interface;

public class UserBeanImp implements UserBean{
    private Users[] users;

    public UserBeanImp() {
    }

    public UserBeanImp(Users[] users) {
        this.users = users;
    }

    public void getAllUsers(){
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].toString());
        }
    }

    public void getUsersByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getName().equals(name)){
                System.out.println(users[i].toString());
            }
        }
    }

    public void getUsersBySurname(String surname){
        for (int i = 0; i < users.length; i++) {
            if (users[i].getSurname().equals(surname)){
                System.out.println(users[i].toString());
            }
        }
    }
}
