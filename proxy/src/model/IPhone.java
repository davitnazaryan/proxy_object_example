package model;

public class IPhone {
    String name = "Davit";
    int age = 22;

    @Override
    public String toString() {
        return "IPhone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        System.out.println(iPhone.toString());
    }
}
