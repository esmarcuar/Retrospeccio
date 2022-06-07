package eetac.ea;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class Test {
    public static void main(String[] args) throws Exception {
        User u = new User("1", "Juan");
        System.out.println(u.getNom());

        Class c = Class.forName("eetac.ea.User");

        User u2 = (User) c.newInstance();
        u2.setName("Pere");
        System.out.println(u2.getNom());

        Class c2 = u.getClass();
        for (Constructor constr: c2.getConstructors()) {
            System.out.println(constr.toGenericString());
        }
        System.out.println("=====");
        for (Field f: c2.getDeclaredFields()) {
            System.out.println(f.getName());
        }
        System.out.println("=====");
        for (Method m: c2.getMethods()) {
            System.out.println(m.getName());
        }

    }
}
