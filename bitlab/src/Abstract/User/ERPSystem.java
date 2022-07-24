package Abstract.User;

public class ERPSystem {
    User[] memory = new User[1000]; ////максимум 1000 пользователей
    int sizeOfUsers = 0;

    public ERPSystem() {
    }

    public ERPSystem(User[] memory) {
        this.memory = memory;
    }

    public void addUser(User u) {
        if (u instanceof Student) {
            memory[sizeOfUsers] = u;
            sizeOfUsers++;
        } else if (u instanceof Teacher) {
            memory[sizeOfUsers] = u;
            sizeOfUsers++;
        }
    } //// метод добавляет пользователя

    public void printAllUsers() {
        for (int i = 0; i < sizeOfUsers; i++)
            System.out.println(memory[i].getUserData());
    } //// метод выводит на экран всех пользователей

    public void printUser(int index) {
        if (0 <= index && index <= sizeOfUsers) {
            System.out.println(memory[index].getUserData());
        }else {

            System.out.println("No such user in this index");
        }
    } //// метод выводит на экран одного пользователя
}
