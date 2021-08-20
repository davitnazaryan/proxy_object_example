import factory.Models;
import model.IUser;

public class Main {
    public static void main(String[] args) {
        IUser user = Models.newUser();
        user.setName("Davit");
        user.setSurname("Nazaryan");
        user.setAge(22);
        System.out.println(user.toString());
    }


}
