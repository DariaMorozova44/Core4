package task;

import java.util.Objects;

public class User {
    private static int nextId = 1;
    private final int id;
    private String name;
    private int age;
    private String mail;
    private String address;

    public User(String name, int age, String mail, String address) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
        this.mail = mail;
        this.address = address;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && age == user.age && Objects.equals(name, user.name) && Objects.equals(mail, user.mail) && Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, mail, address);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
