package factory;

import model.IBook;
import model.IUser;

import java.lang.reflect.Proxy;

public class Models {
    public static IUser newUser(){
        return (IUser) Proxy.newProxyInstance(Models.class.getClassLoader(),new Class[]{IUser.class},
                new DynamicUserInvocationHandler());

    }
    public static IBook newBook() {
        return (IBook) Proxy.newProxyInstance(
                Models.class.getClassLoader(), new Class[]{IBook.class},
                new DynamicUserInvocationHandler());
    }
}
