package task;

import java.util.Scanner;

import static task.UserManager.list;

public class ApplicationRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operation;

        while (true) {
            System.out.println("введите операцию");
            operation = scanner.nextLine();
            try {
                switch (operation) {
                    case "создать":
                        System.out.println("введите имя, возраст, почту, адрес");
                        Scanner sc1 = new Scanner(System.in);
                        String name = sc1.next();
                        int age = sc1.nextInt();
                        String mail = sc1.next();
                        String address = sc1.next();
                        UserManager.create(name, age, mail, address);
                        System.out.println("добавлен");
                        break;
                    case "получить":
                        System.out.println("введите id");
                        Scanner sc2 = new Scanner(System.in);
                        int id1 = sc2.nextInt();
                        UserManager.get(id1);
                        break;
                    case "обновить имя":
                        System.out.println("введите id и имя");
                        Scanner sc3 = new Scanner(System.in);
                        int id2 = sc3.nextInt();
                        String name1 = sc3.next();
                        UserManager.update(id2, name1);
                        System.out.println(list);
                        break;
                    case "удалить":
                        System.out.println("введите id");
                        Scanner sc4 = new Scanner(System.in);
                        int id3 = sc4.nextInt();
                        UserManager.delete(id3);
                        System.out.println("удален");
                        break;
                    case "запись в файл":
                        System.out.println("введите данные");
                        Scanner sc5 = new Scanner(System.in);
                        String name2 = sc5.next();
                        int age1 = sc5.nextInt();
                        String mail1 = sc5.next();
                        String address1 = sc5.next();
                        UserInfoFileManager.createFail(new User(name2, age1, mail1, address1));
                        break;
                    case "информация":
                        System.out.println(UserManager.info());
                        break;
                    case "сортируй по имени":
                        UserManager.sortName();
                        System.out.println(list);
                        break;
                    case "сортируй по адресу":
                        UserManager.sortAddress();
                        System.out.println(list);
                        break;
                    case "завершить":
                        System.out.println("работа окончена");
                        return;
                    default:
                        System.out.println("нет подходящей команды");
                }
            } catch (Exception e) {
                System.out.println(e + " неправильные данные");
                scanner.nextLine();
            }
        }
    }
}




// TODO: Требования:
//        1. Создание класса User с полями для хранения информации о пользователе ( id, имя, возраст, email ,adress).
//        2. Создание класса, который управляет данными пользователей (UserManager) и имеет методы для создания, получения,
//        обновления и удаления пользователей.  Так же реализуйте методы сортировки пользователей по адресам , именам.
//        3. Для хранения данных используйте коллекции
//        4. Создание класса , который создает файл с информацией о пользователе(UserInfoFileManager).
//          Класс должен записывать информацию о пользователе в File.txt
//        5. Реализация консольного интерфейса для взаимодействия с методами

//    Пример выполнения задачи:
//            1. Создание класса Main для запуска приложения.
//            2. Создание класса User для представления данных о пользователе.
//            3. Создание класса UserManager для управления данными пользователей, включая методы для создания, чтения, обновления и др методов.
//            4.UserInfoFileManager вызывает метод get получая пользователя и записывает его данные в файл.
//            5. Реализация консольного интерфейса(при помощи new Scanner()) для взаимодействия с пользователем, включая команды для вызова различных функций
//            (например, "create", "get", "update", "delete" и т.д ).К примеру при вызове create я создам нового пользователя ,
//            при вызове list верну всех добавленных пользователей.

