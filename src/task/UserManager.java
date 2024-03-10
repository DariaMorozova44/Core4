package task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserManager {
    public static List<User> list = new ArrayList<>();

    public static void create(String name, int age, String mail, String address) {
        User user = new User(name, age, mail, address);
        list.add(user);
    }

    public static void get(int id) {
        for (User user : list) {
            if (user.getId() == id) {
                System.out.println(user);
            } else {
                System.out.println("не найден");
            }
        }
    }


    public static void update(int id, String name) {
        for (User user : list) {
            if (user.getId() == id) {
                user.setName(name);
                System.out.println(user);
            } else {
                System.out.println("не найден");
            }
        }
    }

    public static void delete(int id) {
        list.removeIf(user -> user.getId() == id);
    }

    public static List<User> info() {
        return list;

    }

    public static void sortName() {
        List<User> list1 = list.stream().sorted((x, y) -> x.getName().compareTo(y.getName())).collect(Collectors.toList());
        System.out.println(list1);

    }

    public static void sortAddress() {
        List<User> list2 = list.stream().sorted((x, y) -> x.getAddress().compareTo(y.getAddress())).collect(Collectors.toList());
        System.out.println(list2);
    }
}

